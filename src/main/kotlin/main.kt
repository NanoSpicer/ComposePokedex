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
import constants.AppColors
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient
import model.Pokemon
import utils.inPairs
import viewmodel.PokeViewModel
import views.PokemonUI
import java.io.File
import javax.imageio.ImageIO

val pokeVM = PokeViewModel(PokeApiClient())

fun main() = Window(
    title = "Pokédex",
    size = IntSize(500, 600),
    centered = false,
    icon = ImageIO.read((File("pokemon.png")))
) {
    MaterialTheme {
        MainScreen()
    }
}

@Composable fun MainScreen() = Box (modifier = Modifier.fillMaxHeight()){
    val verticalState = rememberScrollState(0)
    val pokes by pokeVM.pokemon.collectAsState(null)
    Column (
        modifier =
        Modifier
            .fillMaxHeight().fillMaxWidth()
            .verticalScroll(verticalState),
    ) {

        when {
            pokes == null -> CircularProgressIndicator(Modifier.size(64.dp))
            pokes!!.isEmpty() -> Text("No pokes to show :(!")
            else -> PokeList(pokes.orEmpty()) {
                println(it)
            }
        }

    }
    VerticalScrollbar(
        modifier = Modifier.fillMaxHeight().align(Alignment.CenterEnd),
        adapter = rememberScrollbarAdapter(verticalState)
    )
}

@Composable
fun PokeList(list: List<Pokemon>, onClick: (Pokemon) -> Unit) {

    for ((first, second) in list.inPairs()) {
        Row(modifier = Modifier.fillMaxWidth())  {
            Column(Modifier.fillMaxWidth(0.5f)) { pokemonOrNothing(first, onClick) }
            Column(Modifier.fillMaxWidth()) { pokemonOrNothing(second, onClick) }
        }
    }
}

@Composable
fun pokemonOrNothing(poke: Pokemon?, onClick: (Pokemon) -> Unit)  {
    poke
        ?.let{ PokemonUI(it, onClick) }
}

