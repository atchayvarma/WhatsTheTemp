package com.tamilanapps.whatsthetemp.ui.components.WeatherConditions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.tamilanapps.whatsthetemp.theme.cardShape1
import com.tamilanapps.whatsthetemp.utils.*

@Composable
fun DisplayFiveDaysForecast(){
    Column() {
        Text(
            text = FIVE_DAYS_FORECAST,
            style = MaterialTheme.typography.h2,
            modifier = Modifier
                .padding(5.dp)
            )

        ForecastCard(day = DAY_1, temp = DAY_1_TEMP)
        ForecastCard(day = DAY_2, temp = DAY_2_TEMP)
        ForecastCard(day = DAY_3, temp = DAY_3_TEMP)
        ForecastCard(day = DAY_4, temp = DAY_4_TEMP)
        ForecastCard(day = DAY_5, temp = DAY_5_TEMP)

    }
}

@Composable
fun ForecastCard( day:String, temp:String ){
    Card(
        elevation = 20.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 15.dp,
                end = 15.dp,
                top = 5.dp,
            )
            .clip(cardShape1)
    ) {
         Row(
             verticalAlignment = Alignment.CenterVertically,
             horizontalArrangement = Arrangement.SpaceEvenly,
             modifier = Modifier
                 .fillMaxWidth()
         ) {

             Image(
                 painter = painterResource(DRIZZLE_DAY),
                 contentDescription = "Forecast Image",
                 modifier = Modifier
                     .height(50.dp)
                     .padding(end = 20.dp),
             )

             Text(
                 text = day,
                 style = MaterialTheme.typography.h3,
                 modifier = Modifier
                     .padding(
                         start = 5.dp,
                         end = 20.dp
                     )
             )

             Text(
                 text = temp,
                 style = MaterialTheme.typography.h2,
                 modifier = Modifier
                     .padding(
                         start = 5.dp,
                     )
             )

         }

    }
}