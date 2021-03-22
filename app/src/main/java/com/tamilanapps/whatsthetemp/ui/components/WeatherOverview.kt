package com.tamilanapps.whatsthetemp.ui.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.tamilanapps.whatsthetemp.theme.WhatsTheTempTheme
import com.tamilanapps.whatsthetemp.theme.backgroundColor
import com.tamilanapps.whatsthetemp.utils.*


/* The word micro interaction means extra animations beside the weather condition image */
@Composable
fun ShowWeatherOverview (temp: String, weatherCondition:String){

    //Painter objects
    var imagePainter: Painter? = null
    var microInteractionPainter: Painter? = null
    var microInteractionPainter1: Painter? = null

    //Animation objects
    val infiniteTransition: InfiniteTransition = rememberInfiniteTransition()
    val positionState1 = infiniteTransition.animateFloat(
        initialValue =  0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            tween(
                durationMillis =  12000,
                easing = LinearEasing
            )
        )
    )

    val positionState2 = infiniteTransition.animateFloat(
        initialValue =  0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            tween(
                durationMillis =  8000,
                easing = LinearEasing
            ),
        )
    )




    //Switch statement for reacting for weather conditions
    when(weatherCondition){
        WEATHER_CLOUDY -> {
            if(Day())  imagePainter = painterResource(id = CLOUDY_SKY_DAY) else imagePainter = painterResource(id = CLOUDY_SKY_NIGHT)
            microInteractionPainter = painterResource(id = CLOUDY_MICROINTERACTION)
            microInteractionPainter1 = painterResource(id = CLOUDY_MICROINTERACTION)
        }

    }

    Column( modifier = Modifier
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        //DegreeCelsius text
        Text(
            text = temp,
            color = Color.White,
            style = MaterialTheme.typography.h1,
        )

        //DegreeCelsius text
        Text(
            text = temp,
            color = Color.White,
            style = MaterialTheme.typography.h1,
        )

        /* Box that contains images*/
        BoxWithConstraints(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
            ,
        ) {


        //Image Modifiers
        val image1Modifier: Modifier = Modifier.offset(
                x = maxWidth * positionState1.value
        )

        val image2Modifier: Modifier = Modifier.offset(
                x = maxWidth * positionState2.value
        )

            //MicroInteraction Image 1
            Image(
                painter = microInteractionPainter1!!,
                contentDescription = null,
                modifier = image1Modifier
                    .width(50.dp)
                    .fillMaxHeight(),
                alignment = Alignment.BottomStart,
            )

            //Weather condition Image
            Image(
                alignment = Alignment.Center,
                painter = imagePainter!!,
                contentDescription = null,
                modifier = Modifier
                    .height(250.dp)
                    .fillMaxWidth(),

                )

            //MicroInteraction Image 2
            Image(
                painter = microInteractionPainter!!,
                contentDescription = null,
                modifier = image2Modifier
                    .width(100.dp)
                    .fillMaxHeight(),
                alignment = Alignment.BottomStart,
            )

            }



        }



    }