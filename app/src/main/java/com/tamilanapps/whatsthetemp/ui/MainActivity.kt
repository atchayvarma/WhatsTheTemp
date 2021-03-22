package com.tamilanapps.whatsthetemp.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.tamilanapps.whatsthetemp.utils.*
import com.tamilanapps.whatsthetemp.theme.WhatsTheTempTheme
import com.tamilanapps.whatsthetemp.theme.backgroundColor
import com.tamilanapps.whatsthetemp.ui.components.ShowWeatherOverview


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsTheTempTheme {

                Surface(color = backgroundColor, modifier = Modifier.fillMaxSize()) {
                        ShowWeatherOverview(temp = DegreeCelsius, weatherCondition = WEATHER_CLOUDY)
                }

            }
        }
    }


    //Preview Function
    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        WhatsTheTempTheme {

            Surface(color = backgroundColor) {
                    ShowWeatherOverview(temp = DegreeCelsius, weatherCondition = WEATHER_CLOUDY)
            }
        }


    }
}
