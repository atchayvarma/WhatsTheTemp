package com.tamilanapps.whatsthetemp.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
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
import androidx.compose.ui.unit.dp
import com.tamilanapps.whatsthetemp.helper.*
import com.tamilanapps.whatsthetemp.helper.AnimVals.CLOUDY_MICROINTERACTION_MODIFIER1
import com.tamilanapps.whatsthetemp.helper.AnimVals.CLOUDY_MICROINTERACTION_MODIFIER2
import com.tamilanapps.whatsthetemp.theme.WhatsTheTempTheme


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsTheTempTheme {

                Surface(color = MaterialTheme.colors.background ) {
                    ShowCurrentWeather(temp = DegreeCelsius, WEATHER_CLOUDY)
                }
            }
        }
    }
}

@Composable
fun ShowCurrentWeather (temp: String, weatherCondition:String){

    //Painter objects
    var imagePainter: Painter? = null
    var microInteractionPainter: Painter? = null
    var microInteractionPainter1: Painter? = null


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

        BoxWithConstraints(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
            ,
        ) {


            //MicroInteraction Image 1
            Image(
                painter = microInteractionPainter1!!,
                contentDescription = null,
                modifier = CLOUDY_MICROINTERACTION_MODIFIER1(theMaxWidth = maxWidth)
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
                modifier = CLOUDY_MICROINTERACTION_MODIFIER2(theMaxWidth = maxWidth)
                    .width(100.dp)
                    .fillMaxHeight(),
                alignment = Alignment.BottomStart,
            )




        }

    }
}


//Preview Function
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WhatsTheTempTheme {
        ShowCurrentWeather(temp = DegreeCelsius, WEATHER_CLOUDY)
    }


}

