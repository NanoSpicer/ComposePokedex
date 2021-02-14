import androidx.compose.runtime.*
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jetbrains.skija.Image
import java.io.ByteArrayOutputStream
import java.net.URL
import javax.imageio.ImageIO


private suspend fun _imageFromUrl(url: String): ImageBitmap = withContext(Dispatchers.IO) {
    val bufImg = ImageIO.read(URL(url))
    val outStream = ByteArrayOutputStream()
    ImageIO.write(bufImg, "png", outStream)
    Image.makeFromEncoded(outStream.toByteArray()).asImageBitmap()
}

@Composable fun imageFromUrl(imageUrl: String?): ImageBitmap? {
    var image by remember(imageUrl) { mutableStateOf<ImageBitmap?>(null) }
    LaunchedEffect(imageUrl) {
        image = imageUrl?.let { _imageFromUrl(it) }
    }
    return image
}