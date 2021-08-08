package datasource

import constants.PokemonType
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient
import model.Pokemon
import java.util.*

object PokeRepo {
    var hitCache = true
    private val pokeApiClient = PokeApiClient()

    suspend fun getPokemon() =
        if (hitCache)
            cachedPokes
        else
            fetchPokemon(0..151, pokeApiClient) { pokemon ->
                pokemon.run {
                    Pokemon(
                        pokedexIndex=id,
                        imageUrl=sprites.frontDefault,
                        pokemonName=name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() },
                        types=types.mapNotNull { PokemonType.fromString(it.type.name) }
                    )
                }
            }

}