package com.tamilanapps.whatsthetemp.ui

import com.tamilanapps.whatsthetemp.ui.components.DisplayWeatherOverview
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tamilanapps.whatsthetemp.utils.*
import com.tamilanapps.whatsthetemp.theme.WhatsTheTempTheme
import com.tamilanapps.whatsthetemp.theme.backgroundColor
import com.tamilanapps.whatsthetemp.ui.components.DisplayDetailedWeather
import com.tamilanapps.whatsthetemp.ui.components.DisplayTodayWeather
import com.tamilanapps.whatsthetemp.ui.components.WeatherConditions.DisplayFiveDaysForecast


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsTheTempTheme {

                //Loading UI Components
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .background(backgroundColor)
                    .verticalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    DisplayWeatherOverview(temp = TEMP, weatherCondition = WEATHER_CLOUDY)
                    DisplayDetailedWeather()
                    DisplayTodayWeather()
                    DisplayFiveDaysForecast()
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
            Column(modifier = Modifier
                .fillMaxWidth()
                .background(backgroundColor)
                .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                DisplayWeatherOverview(temp = TEMP, weatherCondition = WEATHER_CLOUDY)
                DisplayDetailedWeather()
                DisplayTodayWeather()
            }

        }


    }
}
