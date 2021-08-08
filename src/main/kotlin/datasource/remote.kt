package datasource

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.withContext
import me.sargunvohra.lib.pokekotlin.client.PokeApi
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient
import me.sargunvohra.lib.pokekotlin.model.Pokemon


suspend fun <T> fetchPokemon(range: IntRange, pokeApi: PokeApiClient = PokeApiClient(), mappingFn: (Pokemon) -> T): List<T> = withContext(Dispatchers.IO){
    val pokes = pokeApi.getPokemonList(range.first, range.last).results
    val pokesWithDetails = pokes.map { async { pokeApi.getPokemon(it.id) } }.awaitAll()

    withContext(Dispatchers.Default) { pokesWithDetails.map(mappingFn) }
}