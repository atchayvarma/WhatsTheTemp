package com.tamilanapps.whatsthetemp.ui.components

import DisplayClearWeatherOverview
import DisplayCloudyWeatherOverview
import DisplayDrizzleWeatherOverview
import DisplayMistWeatherOverview
import DisplayRainWeatherOverview
import DisplaySnowWeatherOverview
import DisplayThunderstormWeatherOverview
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.tamilanapps.whatsthetemp.utils.*


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

                WEATHER_CLEAR-> {
                    DisplayClearWeatherOverview()
                }

                WEATHER_SNOW-> {
                    DisplaySnowWeatherOverview()
                }
                WEATHER_RAIN -> {
                    DisplayRainWeatherOverview()
                }
                WEATHER_THUNDERSTORM -> {
                    DisplayThunderstormWeatherOverview()
                }
                WEATHER_DRIZZLE -> {
                    DisplayDrizzleWeatherOverview()
                }
                WEATHER_MIST -> {
                    DisplayMistWeatherOverview()
                }
            }

        }



    }

