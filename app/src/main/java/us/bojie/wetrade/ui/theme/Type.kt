package us.bojie.wetrade.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import us.bojie.wetrade.R

private val Montserrat = FontFamily(
    Font(R.font.montserrat_extraBold, FontWeight.ExtraBold),
    Font(R.font.montserrat_semibold, FontWeight.SemiBold),
    Font(R.font.montserrat_medium, FontWeight.Medium),
    Font(R.font.montserrat_light, FontWeight.Light),
    Font(R.font.montserrat_bold, FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = Montserrat,
        fontSize = 40.sp,
        fontWeight = FontWeight.ExtraBold,
        letterSpacing = 1.25.sp
    ),
    h2 = TextStyle(
        fontFamily = Montserrat,
        fontSize = 36.sp,
        fontWeight = FontWeight.ExtraBold,
        letterSpacing = 0.sp
    ),
    h3 = TextStyle(
        fontFamily = Montserrat,
        fontSize = 13.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = Montserrat,
        fontSize = 15.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp
    ),
    body1 = TextStyle(
        fontFamily = Montserrat,
        fontSize = 13.sp,
        fontWeight = FontWeight.Light,
        letterSpacing = 0.sp
    ),
    button = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Bold,
        fontSize = 13.sp,
        letterSpacing = 1.25.sp,
        fontFeatureSettings = "c2sc, smcp"
    )
)
