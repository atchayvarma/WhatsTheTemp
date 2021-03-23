package com.tamilanapps.whatsthetemp.theme
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

//Colors for theming
//Background color
val backgroundColor = Color(0xD3000000)
//Primary app color
val primaryRed = Color(0xFF4444)
//Primary text color
val primaryTextColor = Color( 0xFFFFFFFF)
//Secondary text color
val secondaryTextColor = Color( 0xADFFFFFF)


//Base colors for gradients

//Gradient base colors for gradientCard1
val gradientColor1gradientCard1 = Color( 0xFF09c6f9)
val gradientColor2gradientCard1 = Color( 0xFF045de9)

//Gradient base color for mainTopBG
val gradientColor1mainTopBG = Color( 0xFF09c6f9)
val gradientColor2mainTopBG = Color(0xD3000000)


//Gradients

//For cards

val gradientCard1 = Brush.horizontalGradient(listOf(gradientColor1gradientCard1, gradientColor2gradientCard1))
//For Main gradient background
val mainTopBG = Brush.verticalGradient(listOf(gradientColor1mainTopBG, gradientColor2mainTopBG))