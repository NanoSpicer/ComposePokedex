import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient
import model.Pokemon
import viewmodel.PokeViewModel
import views.PokemonUI
import java.io.File
import javax.imageio.ImageIO
import kotlin.system.exitProcess

val pokeVM = PokeViewModel(PokeApiClient())

fun onExit() {
    exitProcess(0)
}

fun main() = application {

    Window(
        title = "Pokédex",
        icon = painterResource("pokemon.png"),
        state = WindowState(
            size = WindowSize(500.dp, 600.dp),
        ),
        onCloseRequest = ::onExit
    ){
        MaterialTheme {
            MainScreen()
        }
    }
}


@Composable fun MainScreen() = Box (modifier = Modifier.fillMaxHeight()){
    PokeList(pokeVM)
}


@Composable fun BoxScope.PokeList(vm: PokeViewModel) {
    var snackbarData by remember { mutableStateOf<Pokemon?>(null) }
    val verticalState = rememberScrollState(0)
    val pokes by vm.pokemon.collectAsState(null)
    Column (
        modifier = Modifier.fillMaxHeight().verticalScroll(verticalState).fillMaxWidth(),
    ) {
        Row {
            when {
                pokes == null -> CircularProgressIndicator(Modifier.size(64.dp))
                pokes!!.isEmpty() -> Text("No pokes to show :(!")
                else -> for (poke in pokes.orEmpty()) {

                    PokemonUI(poke) {
                        println(it)
                        snackbarData = it
                    }
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



