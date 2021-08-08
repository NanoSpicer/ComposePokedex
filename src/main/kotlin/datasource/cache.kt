package datasource

import model.Pokemon
import constants.PokemonType

val cachedPokes = listOf(
    Pokemon(
        pokemonName = "Bulbasaur",
        pokedexIndex = 1,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png",
        types = listOf(PokemonType.Grass, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Ivysaur",
        pokedexIndex = 2,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/2.png",
        types = listOf(PokemonType.Grass, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Venusaur",
        pokedexIndex = 3,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/3.png",
        types = listOf(PokemonType.Grass, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Charmander",
        pokedexIndex = 4,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png",
        types = listOf(PokemonType.Fire)
    ), Pokemon(
        pokemonName = "Charmeleon",
        pokedexIndex = 5,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/5.png",
        types = listOf(PokemonType.Fire)
    ), Pokemon(
        pokemonName = "Charizard",
        pokedexIndex = 6,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png",
        types = listOf(PokemonType.Fire, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Squirtle",
        pokedexIndex = 7,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png",
        types = listOf(PokemonType.Water)
    ), Pokemon(
        pokemonName = "Wartortle",
        pokedexIndex = 8,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/8.png",
        types = listOf(PokemonType.Water)
    ), Pokemon(
        pokemonName = "Blastoise",
        pokedexIndex = 9,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/9.png",
        types = listOf(PokemonType.Water)
    ), Pokemon(
        pokemonName = "Caterpie",
        pokedexIndex = 10,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/10.png",
        types = listOf(PokemonType.Bug)
    ), Pokemon(
        pokemonName = "Metapod",
        pokedexIndex = 11,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/11.png",
        types = listOf(PokemonType.Bug)
    ), Pokemon(
        pokemonName = "Butterfree",
        pokedexIndex = 12,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/12.png",
        types = listOf(PokemonType.Bug, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Weedle",
        pokedexIndex = 13,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/13.png",
        types = listOf(PokemonType.Bug, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Kakuna",
        pokedexIndex = 14,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/14.png",
        types = listOf(PokemonType.Bug, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Beedrill",
        pokedexIndex = 15,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/15.png",
        types = listOf(PokemonType.Bug, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Pidgey",
        pokedexIndex = 16,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/16.png",
        types = listOf(PokemonType.Normal, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Pidgeotto",
        pokedexIndex = 17,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/17.png",
        types = listOf(PokemonType.Normal, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Pidgeot",
        pokedexIndex = 18,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/18.png",
        types = listOf(PokemonType.Normal, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Rattata",
        pokedexIndex = 19,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/19.png",
        types = listOf(PokemonType.Normal)
    ), Pokemon(
        pokemonName = "Raticate",
        pokedexIndex = 20,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/20.png",
        types = listOf(PokemonType.Normal)
    ), Pokemon(
        pokemonName = "Spearow",
        pokedexIndex = 21,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/21.png",
        types = listOf(PokemonType.Normal, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Fearow",
        pokedexIndex = 22,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/22.png",
        types = listOf(PokemonType.Normal, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Ekans",
        pokedexIndex = 23,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/23.png",
        types = listOf(PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Arbok",
        pokedexIndex = 24,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/24.png",
        types = listOf(PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Pikachu",
        pokedexIndex = 25,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png",
        types = listOf(PokemonType.Electric)
    ), Pokemon(
        pokemonName = "Raichu",
        pokedexIndex = 26,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/26.png",
        types = listOf(PokemonType.Electric)
    ), Pokemon(
        pokemonName = "Sandshrew",
        pokedexIndex = 27,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/27.png",
        types = listOf(PokemonType.Ground)
    ), Pokemon(
        pokemonName = "Sandslash",
        pokedexIndex = 28,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/28.png",
        types = listOf(PokemonType.Ground)
    ), Pokemon(
        pokemonName = "Nidoran-f",
        pokedexIndex = 29,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/29.png",
        types = listOf(PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Nidorina",
        pokedexIndex = 30,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/30.png",
        types = listOf(PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Nidoqueen",
        pokedexIndex = 31,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/31.png",
        types = listOf(PokemonType.Poison, PokemonType.Ground)
    ), Pokemon(
        pokemonName = "Nidoran-m",
        pokedexIndex = 32,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/32.png",
        types = listOf(PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Nidorino",
        pokedexIndex = 33,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/33.png",
        types = listOf(PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Nidoking",
        pokedexIndex = 34,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/34.png",
        types = listOf(PokemonType.Poison, PokemonType.Ground)
    ), Pokemon(
        pokemonName = "Clefairy",
        pokedexIndex = 35,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/35.png",
        types = listOf(PokemonType.Fairy)
    ), Pokemon(
        pokemonName = "Clefable",
        pokedexIndex = 36,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/36.png",
        types = listOf(PokemonType.Fairy)
    ), Pokemon(
        pokemonName = "Vulpix",
        pokedexIndex = 37,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/37.png",
        types = listOf(PokemonType.Fire)
    ), Pokemon(
        pokemonName = "Ninetales",
        pokedexIndex = 38,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/38.png",
        types = listOf(PokemonType.Fire)
    ), Pokemon(
        pokemonName = "Jigglypuff",
        pokedexIndex = 39,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/39.png",
        types = listOf(PokemonType.Normal, PokemonType.Fairy)
    ), Pokemon(
        pokemonName = "Wigglytuff",
        pokedexIndex = 40,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/40.png",
        types = listOf(PokemonType.Normal, PokemonType.Fairy)
    ), Pokemon(
        pokemonName = "Zubat",
        pokedexIndex = 41,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/41.png",
        types = listOf(PokemonType.Poison, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Golbat",
        pokedexIndex = 42,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/42.png",
        types = listOf(PokemonType.Poison, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Oddish",
        pokedexIndex = 43,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/43.png",
        types = listOf(PokemonType.Grass, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Gloom",
        pokedexIndex = 44,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/44.png",
        types = listOf(PokemonType.Grass, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Vileplume",
        pokedexIndex = 45,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/45.png",
        types = listOf(PokemonType.Grass, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Paras",
        pokedexIndex = 46,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/46.png",
        types = listOf(PokemonType.Bug, PokemonType.Grass)
    ), Pokemon(
        pokemonName = "Parasect",
        pokedexIndex = 47,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/47.png",
        types = listOf(PokemonType.Bug, PokemonType.Grass)
    ), Pokemon(
        pokemonName = "Venonat",
        pokedexIndex = 48,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/48.png",
        types = listOf(PokemonType.Bug, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Venomoth",
        pokedexIndex = 49,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/49.png",
        types = listOf(PokemonType.Bug, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Diglett",
        pokedexIndex = 50,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/50.png",
        types = listOf(PokemonType.Ground)
    ), Pokemon(
        pokemonName = "Dugtrio",
        pokedexIndex = 51,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/51.png",
        types = listOf(PokemonType.Ground)
    ), Pokemon(
        pokemonName = "Meowth",
        pokedexIndex = 52,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/52.png",
        types = listOf(PokemonType.Normal)
    ), Pokemon(
        pokemonName = "Persian",
        pokedexIndex = 53,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/53.png",
        types = listOf(PokemonType.Normal)
    ), Pokemon(
        pokemonName = "Psyduck",
        pokedexIndex = 54,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/54.png",
        types = listOf(PokemonType.Water)
    ), Pokemon(
        pokemonName = "Golduck",
        pokedexIndex = 55,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/55.png",
        types = listOf(PokemonType.Water)
    ), Pokemon(
        pokemonName = "Mankey",
        pokedexIndex = 56,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/56.png",
        types = listOf(PokemonType.Fighting)
    ), Pokemon(
        pokemonName = "Primeape",
        pokedexIndex = 57,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/57.png",
        types = listOf(PokemonType.Fighting)
    ), Pokemon(
        pokemonName = "Growlithe",
        pokedexIndex = 58,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/58.png",
        types = listOf(PokemonType.Fire)
    ), Pokemon(
        pokemonName = "Arcanine",
        pokedexIndex = 59,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/59.png",
        types = listOf(PokemonType.Fire)
    ), Pokemon(
        pokemonName = "Poliwag",
        pokedexIndex = 60,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/60.png",
        types = listOf(PokemonType.Water)
    ), Pokemon(
        pokemonName = "Poliwhirl",
        pokedexIndex = 61,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/61.png",
        types = listOf(PokemonType.Water)
    ), Pokemon(
        pokemonName = "Poliwrath",
        pokedexIndex = 62,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/62.png",
        types = listOf(PokemonType.Water, PokemonType.Fighting)
    ), Pokemon(
        pokemonName = "Abra",
        pokedexIndex = 63,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/63.png",
        types = listOf(PokemonType.Psychic)
    ), Pokemon(
        pokemonName = "Kadabra",
        pokedexIndex = 64,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/64.png",
        types = listOf(PokemonType.Psychic)
    ), Pokemon(
        pokemonName = "Alakazam",
        pokedexIndex = 65,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/65.png",
        types = listOf(PokemonType.Psychic)
    ), Pokemon(
        pokemonName = "Machop",
        pokedexIndex = 66,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/66.png",
        types = listOf(PokemonType.Fighting)
    ), Pokemon(
        pokemonName = "Machoke",
        pokedexIndex = 67,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/67.png",
        types = listOf(PokemonType.Fighting)
    ), Pokemon(
        pokemonName = "Machamp",
        pokedexIndex = 68,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/68.png",
        types = listOf(PokemonType.Fighting)
    ), Pokemon(
        pokemonName = "Bellsprout",
        pokedexIndex = 69,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/69.png",
        types = listOf(PokemonType.Grass, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Weepinbell",
        pokedexIndex = 70,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/70.png",
        types = listOf(PokemonType.Grass, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Victreebel",
        pokedexIndex = 71,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/71.png",
        types = listOf(PokemonType.Grass, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Tentacool",
        pokedexIndex = 72,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/72.png",
        types = listOf(PokemonType.Water, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Tentacruel",
        pokedexIndex = 73,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/73.png",
        types = listOf(PokemonType.Water, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Geodude",
        pokedexIndex = 74,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/74.png",
        types = listOf(PokemonType.Rock, PokemonType.Ground)
    ), Pokemon(
        pokemonName = "Graveler",
        pokedexIndex = 75,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/75.png",
        types = listOf(PokemonType.Rock, PokemonType.Ground)
    ), Pokemon(
        pokemonName = "Golem",
        pokedexIndex = 76,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/76.png",
        types = listOf(PokemonType.Rock, PokemonType.Ground)
    ), Pokemon(
        pokemonName = "Ponyta",
        pokedexIndex = 77,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/77.png",
        types = listOf(PokemonType.Fire)
    ), Pokemon(
        pokemonName = "Rapidash",
        pokedexIndex = 78,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/78.png",
        types = listOf(PokemonType.Fire)
    ), Pokemon(
        pokemonName = "Slowpoke",
        pokedexIndex = 79,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/79.png",
        types = listOf(PokemonType.Water, PokemonType.Psychic)
    ), Pokemon(
        pokemonName = "Slowbro",
        pokedexIndex = 80,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/80.png",
        types = listOf(PokemonType.Water, PokemonType.Psychic)
    ), Pokemon(
        pokemonName = "Magnemite",
        pokedexIndex = 81,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/81.png",
        types = listOf(PokemonType.Electric, PokemonType.Steel)
    ), Pokemon(
        pokemonName = "Magneton",
        pokedexIndex = 82,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/82.png",
        types = listOf(PokemonType.Electric, PokemonType.Steel)
    ), Pokemon(
        pokemonName = "Farfetchd",
        pokedexIndex = 83,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/83.png",
        types = listOf(PokemonType.Normal, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Doduo",
        pokedexIndex = 84,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/84.png",
        types = listOf(PokemonType.Normal, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Dodrio",
        pokedexIndex = 85,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/85.png",
        types = listOf(PokemonType.Normal, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Seel",
        pokedexIndex = 86,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/86.png",
        types = listOf(PokemonType.Water)
    ), Pokemon(
        pokemonName = "Dewgong",
        pokedexIndex = 87,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/87.png",
        types = listOf(PokemonType.Water, PokemonType.Ice)
    ), Pokemon(
        pokemonName = "Grimer",
        pokedexIndex = 88,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/88.png",
        types = listOf(PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Muk",
        pokedexIndex = 89,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/89.png",
        types = listOf(PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Shellder",
        pokedexIndex = 90,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/90.png",
        types = listOf(PokemonType.Water)
    ), Pokemon(
        pokemonName = "Cloyster",
        pokedexIndex = 91,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/91.png",
        types = listOf(PokemonType.Water, PokemonType.Ice)
    ), Pokemon(
        pokemonName = "Gastly",
        pokedexIndex = 92,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/92.png",
        types = listOf(PokemonType.Ghost, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Haunter",
        pokedexIndex = 93,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/93.png",
        types = listOf(PokemonType.Ghost, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Gengar",
        pokedexIndex = 94,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/94.png",
        types = listOf(PokemonType.Ghost, PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Onix",
        pokedexIndex = 95,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/95.png",
        types = listOf(PokemonType.Rock, PokemonType.Ground)
    ), Pokemon(
        pokemonName = "Drowzee",
        pokedexIndex = 96,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/96.png",
        types = listOf(PokemonType.Psychic)
    ), Pokemon(
        pokemonName = "Hypno",
        pokedexIndex = 97,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/97.png",
        types = listOf(PokemonType.Psychic)
    ), Pokemon(
        pokemonName = "Krabby",
        pokedexIndex = 98,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/98.png",
        types = listOf(PokemonType.Water)
    ), Pokemon(
        pokemonName = "Kingler",
        pokedexIndex = 99,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/99.png",
        types = listOf(PokemonType.Water)
    ), Pokemon(
        pokemonName = "Voltorb",
        pokedexIndex = 100,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/100.png",
        types = listOf(PokemonType.Electric)
    ), Pokemon(
        pokemonName = "Electrode",
        pokedexIndex = 101,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/101.png",
        types = listOf(PokemonType.Electric)
    ), Pokemon(
        pokemonName = "Exeggcute",
        pokedexIndex = 102,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/102.png",
        types = listOf(PokemonType.Grass, PokemonType.Psychic)
    ), Pokemon(
        pokemonName = "Exeggutor",
        pokedexIndex = 103,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/103.png",
        types = listOf(PokemonType.Grass, PokemonType.Psychic)
    ), Pokemon(
        pokemonName = "Cubone",
        pokedexIndex = 104,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/104.png",
        types = listOf(PokemonType.Ground)
    ), Pokemon(
        pokemonName = "Marowak",
        pokedexIndex = 105,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/105.png",
        types = listOf(PokemonType.Ground)
    ), Pokemon(
        pokemonName = "Hitmonlee",
        pokedexIndex = 106,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/106.png",
        types = listOf(PokemonType.Fighting)
    ), Pokemon(
        pokemonName = "Hitmonchan",
        pokedexIndex = 107,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/107.png",
        types = listOf(PokemonType.Fighting)
    ), Pokemon(
        pokemonName = "Lickitung",
        pokedexIndex = 108,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/108.png",
        types = listOf(PokemonType.Normal)
    ), Pokemon(
        pokemonName = "Koffing",
        pokedexIndex = 109,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/109.png",
        types = listOf(PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Weezing",
        pokedexIndex = 110,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/110.png",
        types = listOf(PokemonType.Poison)
    ), Pokemon(
        pokemonName = "Rhyhorn",
        pokedexIndex = 111,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/111.png",
        types = listOf(PokemonType.Ground, PokemonType.Rock)
    ), Pokemon(
        pokemonName = "Rhydon",
        pokedexIndex = 112,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/112.png",
        types = listOf(PokemonType.Ground, PokemonType.Rock)
    ), Pokemon(
        pokemonName = "Chansey",
        pokedexIndex = 113,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/113.png",
        types = listOf(PokemonType.Normal)
    ), Pokemon(
        pokemonName = "Tangela",
        pokedexIndex = 114,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/114.png",
        types = listOf(PokemonType.Grass)
    ), Pokemon(
        pokemonName = "Kangaskhan",
        pokedexIndex = 115,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/115.png",
        types = listOf(PokemonType.Normal)
    ), Pokemon(
        pokemonName = "Horsea",
        pokedexIndex = 116,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/116.png",
        types = listOf(PokemonType.Water)
    ), Pokemon(
        pokemonName = "Seadra",
        pokedexIndex = 117,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/117.png",
        types = listOf(PokemonType.Water)
    ), Pokemon(
        pokemonName = "Goldeen",
        pokedexIndex = 118,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/118.png",
        types = listOf(PokemonType.Water)
    ), Pokemon(
        pokemonName = "Seaking",
        pokedexIndex = 119,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/119.png",
        types = listOf(PokemonType.Water)
    ), Pokemon(
        pokemonName = "Staryu",
        pokedexIndex = 120,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/120.png",
        types = listOf(PokemonType.Water)
    ), Pokemon(
        pokemonName = "Starmie",
        pokedexIndex = 121,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/121.png",
        types = listOf(PokemonType.Water, PokemonType.Psychic)
    ), Pokemon(
        pokemonName = "Mr-mime",
        pokedexIndex = 122,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/122.png",
        types = listOf(PokemonType.Psychic, PokemonType.Fairy)
    ), Pokemon(
        pokemonName = "Scyther",
        pokedexIndex = 123,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/123.png",
        types = listOf(PokemonType.Bug, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Jynx",
        pokedexIndex = 124,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/124.png",
        types = listOf(PokemonType.Ice, PokemonType.Psychic)
    ), Pokemon(
        pokemonName = "Electabuzz",
        pokedexIndex = 125,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/125.png",
        types = listOf(PokemonType.Electric)
    ), Pokemon(
        pokemonName = "Magmar",
        pokedexIndex = 126,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/126.png",
        types = listOf(PokemonType.Fire)
    ), Pokemon(
        pokemonName = "Pinsir",
        pokedexIndex = 127,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/127.png",
        types = listOf(PokemonType.Bug)
    ), Pokemon(
        pokemonName = "Tauros",
        pokedexIndex = 128,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/128.png",
        types = listOf(PokemonType.Normal)
    ), Pokemon(
        pokemonName = "Magikarp",
        pokedexIndex = 129,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/129.png",
        types = listOf(PokemonType.Water)
    ), Pokemon(
        pokemonName = "Gyarados",
        pokedexIndex = 130,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/130.png",
        types = listOf(PokemonType.Water, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Lapras",
        pokedexIndex = 131,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/131.png",
        types = listOf(PokemonType.Water, PokemonType.Ice)
    ), Pokemon(
        pokemonName = "Ditto",
        pokedexIndex = 132,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/132.png",
        types = listOf(PokemonType.Normal)
    ), Pokemon(
        pokemonName = "Eevee",
        pokedexIndex = 133,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/133.png",
        types = listOf(PokemonType.Normal)
    ), Pokemon(
        pokemonName = "Vaporeon",
        pokedexIndex = 134,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/134.png",
        types = listOf(PokemonType.Water)
    ), Pokemon(
        pokemonName = "Jolteon",
        pokedexIndex = 135,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/135.png",
        types = listOf(PokemonType.Electric)
    ), Pokemon(
        pokemonName = "Flareon",
        pokedexIndex = 136,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/136.png",
        types = listOf(PokemonType.Fire)
    ), Pokemon(
        pokemonName = "Porygon",
        pokedexIndex = 137,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/137.png",
        types = listOf(PokemonType.Normal)
    ), Pokemon(
        pokemonName = "Omanyte",
        pokedexIndex = 138,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/138.png",
        types = listOf(PokemonType.Rock, PokemonType.Water)
    ), Pokemon(
        pokemonName = "Omastar",
        pokedexIndex = 139,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/139.png",
        types = listOf(PokemonType.Rock, PokemonType.Water)
    ), Pokemon(
        pokemonName = "Kabuto",
        pokedexIndex = 140,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/140.png",
        types = listOf(PokemonType.Rock, PokemonType.Water)
    ), Pokemon(
        pokemonName = "Kabutops",
        pokedexIndex = 141,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/141.png",
        types = listOf(PokemonType.Rock, PokemonType.Water)
    ), Pokemon(
        pokemonName = "Aerodactyl",
        pokedexIndex = 142,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/142.png",
        types = listOf(PokemonType.Rock, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Snorlax",
        pokedexIndex = 143,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/143.png",
        types = listOf(PokemonType.Normal)
    ), Pokemon(
        pokemonName = "Articuno",
        pokedexIndex = 144,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/144.png",
        types = listOf(PokemonType.Ice, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Zapdos",
        pokedexIndex = 145,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/145.png",
        types = listOf(PokemonType.Electric, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Moltres",
        pokedexIndex = 146,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/146.png",
        types = listOf(PokemonType.Fire, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Dratini",
        pokedexIndex = 147,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/147.png",
        types = listOf(PokemonType.Dragon)
    ), Pokemon(
        pokemonName = "Dragonair",
        pokedexIndex = 148,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/148.png",
        types = listOf(PokemonType.Dragon)
    ), Pokemon(
        pokemonName = "Dragonite",
        pokedexIndex = 149,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/149.png",
        types = listOf(PokemonType.Dragon, PokemonType.Flying)
    ), Pokemon(
        pokemonName = "Mewtwo",
        pokedexIndex = 150,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/150.png",
        types = listOf(PokemonType.Psychic)
    ), Pokemon(
        pokemonName = "Mew",
        pokedexIndex = 151,
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/151.png",
        types = listOf(PokemonType.Psychic)
    )
)