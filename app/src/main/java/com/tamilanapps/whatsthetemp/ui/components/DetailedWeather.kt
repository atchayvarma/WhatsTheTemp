package com.tamilanapps.whatsthetemp.ui.components

import androidx.compose.foundation.background
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
import com.tamilanapps.whatsthetemp.theme.gradientCard1
import com.tamilanapps.whatsthetemp.utils.*

/* Composable function which is used for displaying detailed weather */
@Composable
fun DisplayDetailedWeather(){

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(gradientCard1)
            ,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        //Feels like text
        Text(
            text = "Feels like 41",
            style = MaterialTheme.typography.h3
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            //Displaying detail cards
            DetailCard(title = "Wind.spd", value = "${WIND}km/h")
            DetailCard(title = "Temp.Max", value = "${MAX_TEMP}C")
            DetailCard(title = "Wind.spd", value = "${MIN_TEMP}C")
            DetailCard(title = "Wind.spd", value = "${HUMIDITY}%")

        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            //Displaying detail cards

            DetailCard(title = "Snow chance", value = "${SNOW_CHANCE}%")
            DetailCard(title = "Rain Chance", value = "${RAIN_CHANCE}%")


        }
    }


}


@Composable
fun DetailCard( title:String, value:String ) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(5.dp)
    ) {
        //Title text
        Text(
            text = title,
            style = MaterialTheme.typography.h2
        )

        //Value text
        Text(
            text = value,
            style = MaterialTheme.typography.h3
        )
    }
}