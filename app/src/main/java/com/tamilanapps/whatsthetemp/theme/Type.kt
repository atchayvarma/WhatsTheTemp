package com.tamilanapps.whatsthetemp.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.tamilanapps.whatsthetemp.R

//Importing the montserrat font family from 'fonts' dir
val Montserrat = FontFamily(
        Font(R.font.montserrat_thin,FontWeight.Thin),
        Font(R.font.montserrat_regular,FontWeight.Normal),
        Font(R.font.montserrat_medium,FontWeight.Medium),
        Font(R.font.montserrat_bold,FontWeight.Bold),
        Font(R.font.montserrat_extrabold,FontWeight.ExtraBold)
)


// Material typography objects
val typography = Typography(
        h1 = TextStyle(
                fontFamily = Montserrat,
                fontWeight = FontWeight.Bold,
                fontSize = 45.sp,
                color = primaryTextColor
        ),
        h2 = TextStyle(
                fontFamily = Montserrat,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                color = primaryTextColor
        ),
        h3 = TextStyle(
                fontFamily = Montserrat,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                color = secondaryTextColor
        )


)