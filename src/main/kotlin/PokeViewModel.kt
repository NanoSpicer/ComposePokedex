import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient

data class Pokemon(
    val pokemonName: String,
    val pokedexIndex: Int,
    val imageUrl: String?
)

class PokeViewModel(
    private val pokeApi: PokeApiClient
) {

    val pokemon =
        flow {
            val pokes = coroutineScope {
                pokeApi
                    .getPokemonList(0, 151)
                    .results.map {
                        async {
                            val poke = pokeApi.getPokemon(it.id)
                            poke.run { Pokemon(name.capitalize(), id, sprites.frontDefault) }
                        }
                    }
                    .awaitAll()
            }
            emit(pokes)
        }
        .conflate()
        .catch { System.err.println(it.message) }
        .flowOn(Dispatchers.IO)

}