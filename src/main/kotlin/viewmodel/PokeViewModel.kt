package viewmodel

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import model.Pokemon as PokemonModel
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient



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
                            poke.run { PokemonModel(name.capitalize(), id, sprites.frontDefault) }
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