package us.bojie.wetrade.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorPalette = lightColors(
    primary = Yellow,
    onPrimary = Gray900,
    background = Purple,
    surface = Color.White,
    onBackground = Color.White,
    onSurface = Gray900,
    primaryVariant = Green,
    secondaryVariant = Red
)

private val DarkColorPalette = darkColors(
    primary = Yellow,
    onPrimary = Gray900,
    background = Gray900,
    surface = Gray700,
    onBackground = Color.White,
    onSurface = Color.White,
    primaryVariant = Green,
    secondaryVariant = Red
)

@Composable
fun WeTradeTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}