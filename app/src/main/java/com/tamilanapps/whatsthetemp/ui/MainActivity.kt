package com.tamilanapps.whatsthetemp.ui

import com.tamilanapps.whatsthetemp.ui.components.DisplayWeatherOverview
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tamilanapps.whatsthetemp.utils.*
import com.tamilanapps.whatsthetemp.theme.WhatsTheTempTheme
import com.tamilanapps.whatsthetemp.theme.backgroundColor
import com.tamilanapps.whatsthetemp.ui.components.DisplayDetailedWeather


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsTheTempTheme {

                //Loading UI Components
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .background(backgroundColor),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    DisplayWeatherOverview(temp = TEMP, weatherCondition = WEATHER_CLOUDY)
                    DisplayDetailedWeather()
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
                DisplayWeatherOverview(temp = "${TEMP}C", weatherCondition = WEATHER_CLOUDY)
            }

        }


    }
}
