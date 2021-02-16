package model

import constants.PokemonType

data class Pokemon(
    val pokemonName: String,
    val pokedexIndex: Int,
    val imageUrl: String?,
    val types: List<PokemonType>
)