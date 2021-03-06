package views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import imageFromUrl
import model.Pokemon

@Composable
fun PokemonUI(poke: Pokemon, onClick: (Pokemon) -> Unit) {
    val image = imageFromUrl(poke.imageUrl)
    Surface(
        modifier =
        Modifier
            .padding(16.dp, vertical = 8.dp)
            .fillMaxWidth(),
        shape= RoundedCornerShape(8.dp),
        border = BorderStroke(0.7.dp, Color.LightGray),
        elevation = 8.dp,
    ) {
        Row(
            modifier =
            Modifier
                .background(poke.types.first().getColor())
                .clickable { onClick(poke) }
        )  {
            Column(Modifier.align(Alignment.CenterVertically).padding(4.dp)){
                image
                    ?.let { Image(image, poke.pokemonName, modifier = Modifier.height(64.dp)) }
                    ?: CircularProgressIndicator(Modifier.height(64.dp))
            }
            Spacer(Modifier.padding(8.dp, 0.dp))
            Column(Modifier.align(Alignment.CenterVertically)) { Text(poke.pokemonName) }
        }
    }

}
