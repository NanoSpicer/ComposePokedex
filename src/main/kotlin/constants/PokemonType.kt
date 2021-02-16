package constants

import java.util.*

enum class PokemonType {
    Grass, Poison, Fire, Flying,
    Water, Bug, Normal, Electric,
    Ground, Fairy, Fighting, Psychic,
    Rock, Steel, Ice, Ghost, Dragon, Dark;

    companion object {
        fun fromString(str: String): PokemonType? = when(str.toLowerCase(Locale.ROOT)){
            "grass" -> Grass
            "poison" -> Poison
            "fire" -> Fire
            "flying" -> Flying
            "water" -> Water
            "bug" -> Bug
            "normal" -> Normal
            "electric" -> Electric
            "ground" -> Ground
            "fairy" -> Fairy
            "fighting" -> Fighting
            "psychic" -> Psychic
            "rock" -> Rock
            "steel" -> Steel
            "ice" -> Ice
            "ghost" -> Ghost
            "dragon" -> Dragon
            "dark" -> Dark
            else -> null
        }
    }



    fun getColor() = when(this) {
        Grass  -> AppColors.lightGreen
        Bug  -> AppColors.lightTeal
        Fire  -> AppColors.lightRed
        Water  -> AppColors.lightBlue
        Fighting  -> AppColors.red
        Normal  -> AppColors.beige
        Electric  -> AppColors.lightYellow
        Psychic  -> AppColors.lightPink
        Poison  -> AppColors.lightPurple
        Ghost  -> AppColors.purple
        Ground  -> AppColors.darkBrown
        Rock  -> AppColors.lightBrown
        Dark  -> AppColors.black
        Dragon  -> AppColors.violet
        Fairy  -> AppColors.pink
        Flying  -> AppColors.lilac
        Ice  -> AppColors.lightCyan
        Steel  -> AppColors.grey
        // else  -> AppColors.lightBlue
    }
}