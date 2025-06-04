import androidx.compose.foundation.shape.GenericShape
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.graphics.Shape

val OvalShape: Shape = GenericShape { size: Size, _: LayoutDirection ->
    addOval(androidx.compose.ui.geometry.Rect(0f, 0f, size.width, size.height))
}
