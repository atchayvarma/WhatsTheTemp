package com.tamilanapps.whatsthetemp.ui.components

import DisplayCloudyWeatherOverview
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import com.tamilanapps.whatsthetemp.utils.WEATHER_CLOUDY



/* Composable function which is used for displaying weather overview (Current) */
@Composable
 fun DisplayWeatherOverview(temp: String, weatherCondition: String) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            //Displaying temperature
            DisplayTemperatureAndLocation(temp = temp, weatherCondition = WEATHER_CLOUDY)

            //When condition that react to the weather condition
            when (weatherCondition) {
                WEATHER_CLOUDY -> {
                    DisplayCloudyWeatherOverview()
                }
            }

        }



    }

