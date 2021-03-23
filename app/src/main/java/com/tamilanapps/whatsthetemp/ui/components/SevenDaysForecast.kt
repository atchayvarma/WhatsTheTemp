package com.tamilanapps.whatsthetemp.ui.components.WeatherConditions

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.tamilanapps.whatsthetemp.theme.cardShape1
import com.tamilanapps.whatsthetemp.theme.gradientCard1
import com.tamilanapps.whatsthetemp.ui.components.getPainter
import com.tamilanapps.whatsthetemp.utils.*

@Composable
fun DisplayFiveDaysForecast(){
    Column() {
        Text(
            text = SEVEN_DAYS_FORECAST,
            style = MaterialTheme.typography.h2,
            modifier = Modifier
                .padding(5.dp)
            )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.SpaceEvenly,

            ) {
            ForecastCard(day = DAY_1, temp = DAY_1_TEMP, WEATHER_CLOUDY)
            ForecastCard(day = DAY_2, temp = DAY_2_TEMP, WEATHER_CLEAR)
            ForecastCard(day = DAY_3, temp = DAY_3_TEMP, WEATHER_DRIZZLE)
            ForecastCard(day = DAY_4, temp = DAY_4_TEMP, WEATHER_RAIN)
            ForecastCard(day = DAY_5, temp = DAY_5_TEMP, WEATHER_SNOW)
            ForecastCard(day = DAY_6, temp = DAY_6_TEMP, WEATHER_THUNDERSTORM)
            ForecastCard(day = DAY_7, temp = DAY_7_TEMP, WEATHER_MIST)
        }
    }
}

@Composable
fun ForecastCard( day:String, temp:String, weatherCondition:String ){

    lateinit var imagePainter:Painter

    when(weatherCondition){
        WEATHER_CLOUDY -> {
            imagePainter = painterResource(id = CLOUDY_SKY_DAY)
        }
        WEATHER_CLEAR -> {
            imagePainter = painterResource(id = CLEAR_DAY)
        }
        WEATHER_DRIZZLE -> {
            imagePainter = painterResource(id = DRIZZLE_DAY)
        }
        WEATHER_RAIN -> {
            imagePainter = painterResource(id = RAIN_DAY)
        }
        WEATHER_SNOW -> {
            imagePainter = painterResource(id = SNOW_DAY)
        }
       WEATHER_THUNDERSTORM -> {
            imagePainter = painterResource(id = THUNDERSTORM_DAY)
        }
        WEATHER_MIST -> {
        imagePainter = painterResource(id = MIST_DAY)
    }


    }

    Box(
        modifier = Modifier
            .padding(10.dp)
    ) {

        Column(
            modifier = Modifier
                .clip(cardShape1)
                .background(
                    brush = gradientCard1,
                )
                .padding(10.dp)
        ) {
            Text(
                text = day,
                style = MaterialTheme.typography.h2,
            )
            Image(
                painter = imagePainter,
                alignment = Alignment.Center,
                modifier = Modifier
                    .height(75.dp),
                contentDescription = "Weather condition image"
            )

            Text(
                text = temp,
                style = MaterialTheme.typography.h3,
            )

        }
    }

//    Card(
//        elevation = 20.dp,
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(
//                start = 15.dp,
//                end = 15.dp,
//                top = 5.dp,
//            )
//            .clip(cardShape1)
//    ) {
//         Row(
//             verticalAlignment = Alignment.CenterVertically,
//             horizontalArrangement = Arrangement.SpaceEvenly,
//             modifier = Modifier
//                 .fillMaxWidth()
//         ) {
//
//             Image(
//                 painter = painterResource(DRIZZLE_DAY),
//                 contentDescription = "Forecast Image",
//                 modifier = Modifier
//                     .height(50.dp)
//                     .padding(end = 20.dp),
//             )
//
//             Text(
//                 text = day,
//                 style = MaterialTheme.typography.h3,
//                 modifier = Modifier
//                     .padding(
//                         start = 5.dp,
//                         end = 20.dp
//                     )
//             )
//
//             Text(
//                 text = temp,
//                 style = MaterialTheme.typography.h2,
//                 modifier = Modifier
//                     .padding(
//                         start = 5.dp,
//                     )
//             )
//
//         }
//
//    }
}