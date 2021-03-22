package com.tamilanapps.whatsthetemp.ui

import DisplayWeatherOverview
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.tamilanapps.whatsthetemp.utils.*
import com.tamilanapps.whatsthetemp.theme.WhatsTheTempTheme
import com.tamilanapps.whatsthetemp.theme.backgroundColor
import com.tamilanapps.whatsthetemp.ui.components.DisplayLocationIndicator


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsTheTempTheme {

                //Loading UI Components
                Surface(color = backgroundColor) {
                    DisplayLocationIndicator()
                        DisplayWeatherOverview(temp = DegreeCelsius, weatherCondition = WEATHER_CLOUDY)
                }

            }
        }
    }


    //Preview Function
    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        WhatsTheTempTheme {

            //Loading UI Components
            Surface(color = backgroundColor) {
                DisplayLocationIndicator()
                DisplayWeatherOverview(temp = DegreeCelsius, weatherCondition = WEATHER_CLOUDY)
            }

        }


    }
}
