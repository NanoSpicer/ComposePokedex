import androidx.compose.desktop.Window
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient
import model.Pokemon
import viewmodel.PokeViewModel
import views.PokemonUI
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
                PokemonUI(poke) {
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



