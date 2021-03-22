import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.tamilanapps.whatsthetemp.theme.WhatsTheTempTheme

import com.tamilanapps.whatsthetemp.ui.components.DisplayTemperature
import com.tamilanapps.whatsthetemp.utils.WEATHER_CLOUDY





    @Composable
    fun DisplayWeatherOverview(temp: String, weatherCondition: String) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            //Displaying temperature
            DisplayTemperature(temp = temp, weatherCondition = WEATHER_CLOUDY)

            //When condition that react to the weather condition
            when (weatherCondition) {
                WEATHER_CLOUDY -> {
                    DisplayCloudyWeatherOverview()
                }
            }

        }



    }

