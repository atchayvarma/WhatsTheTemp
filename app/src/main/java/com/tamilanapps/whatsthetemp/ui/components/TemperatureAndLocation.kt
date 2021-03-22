package com.tamilanapps.whatsthetemp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.tamilanapps.whatsthetemp.utils.DATE
import com.tamilanapps.whatsthetemp.utils.LOCATION_ICON
import com.tamilanapps.whatsthetemp.utils.WEATHER_CLOUDY


/* Composable function which is used for displaying Temp, Date, Weather condition in text */
@Composable
fun DisplayTemperatureAndLocation(temp:String, weatherCondition: String){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        var _weatherCondition:String? = null

        when(weatherCondition){
            WEATHER_CLOUDY -> {
                _weatherCondition = "Cloudy Sky"
            }
        }

        Spacer(modifier = Modifier.padding(10.dp))

        //Location Indicator
        Row(verticalAlignment = Alignment.CenterVertically,) {
            //Location icon
            Image(
                painter = painterResource(id = LOCATION_ICON),
                contentDescription = "location icon",
                modifier = Modifier
                    .height(25.dp)
            )
            //Location text
            Text(
               modifier = Modifier.
                padding(start = 8.dp),
                text = "Omalur,TN,IN",
                style = MaterialTheme.typography.h4,
            )
        }


        //Date text
        Text(
            text = DATE(),
            style = MaterialTheme.typography.h2,
            modifier = Modifier
                .padding(top = 15.dp)
        )

        //Weather condition text
        _weatherCondition?.let {
            Text(
                text = it,
                style = MaterialTheme.typography.h3,
            )
        }

        //Temperature text
        Text(
            text = temp,
            style = MaterialTheme.typography.h1,
        )
    }
}

