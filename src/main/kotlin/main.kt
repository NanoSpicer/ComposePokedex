import androidx.compose.desktop.Window
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient
import java.io.File
import javax.imageio.ImageIO

val pokeVM = PokeViewModel(PokeApiClient())

fun main() = Window(
    title = "Pokédex",
    size = IntSize(300, 600),
    centered = false,
    icon = ImageIO.read((File("pokemon.png")))
) {
    MaterialTheme {
        MainScreen()
    }
}

@Composable fun MainScreen() = Box (modifier = Modifier.fillMaxHeight()){
    PokeList(pokeVM)
}


@Composable fun BoxScope.PokeList(vm: PokeViewModel) {
    var snackbarData by remember { mutableStateOf<Pokemon?>(null) }
    val verticalState = rememberScrollState(0f)
    val pokes by vm.pokemon.collectAsState(null)
    Column (
        modifier = Modifier.fillMaxHeight().verticalScroll(verticalState).fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        when {
            pokes == null -> CircularProgressIndicator(Modifier.preferredSize(64.dp))
            pokes!!.isEmpty() -> Text("No pokes to show :(!")
            else -> for (poke in pokes.orEmpty()) {
                Pokemon(poke) {
                    println(it)
                    snackbarData = it
                }
            }
        }

    }
    VerticalScrollbar(
        modifier = Modifier.fillMaxHeight().align(Alignment.CenterEnd),
        adapter = rememberScrollbarAdapter(verticalState)
    )

    snackbarData?.let {
        Snackbar(
            modifier = Modifier.padding(16.dp, 8.dp).align(Alignment.BottomCenter),
            action = { Button(onClick = {snackbarData = null}) { Text("Hide") } }
        ) {
            Text("${it.pokedexIndex}.- ${it.pokemonName}")
        }
    }
}


@Composable fun Pokemon(poke: Pokemon, onClick: (Pokemon) -> Unit) {
    val image = imageFromUrl(poke.imageUrl)
    val rowModifs =
        Modifier
            .padding(16.dp, vertical = 8.dp)
            .fillMaxWidth()

    Surface(
        modifier = rowModifs,
        shape=RoundedCornerShape(8.dp),
        border =BorderStroke(0.7.dp, Color.LightGray),
        elevation = 8.dp,
    ) {
        Row(Modifier.clickable { onClick(poke) })  {
            Column(Modifier.align(Alignment.CenterVertically).padding(4.dp)){
                image
                    ?.let { Image(image, modifier = Modifier.preferredHeight(64.dp)) }
                    ?: CircularProgressIndicator(Modifier.preferredHeight(64.dp))
            }
            Spacer(Modifier.padding(8.dp, 0.dp))
            Column(Modifier.align(Alignment.CenterVertically)) { Text(poke.pokemonName) }
        }
    }

}

