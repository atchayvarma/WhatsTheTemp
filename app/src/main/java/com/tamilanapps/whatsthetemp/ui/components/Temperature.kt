package com.tamilanapps.whatsthetemp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.tamilanapps.whatsthetemp.utils.DATE
import com.tamilanapps.whatsthetemp.utils.WEATHER_CLOUDY

@Composable
fun DisplayTemperature(temp:String, weatherCondition: String){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        var _weatherCondition:String? = null

        when(weatherCondition){
            WEATHER_CLOUDY -> {
                _weatherCondition = "Cloudy Sky"
            }
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

