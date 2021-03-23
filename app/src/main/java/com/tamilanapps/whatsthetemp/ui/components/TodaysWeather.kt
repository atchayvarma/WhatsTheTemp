package com.tamilanapps.whatsthetemp.ui.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
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
import com.tamilanapps.whatsthetemp.utils.*

@Composable
fun DisplayTodayWeather(){
    Column {

        Text(
            text = TODAY_STATISTICS,
            style = MaterialTheme.typography.h2,
            modifier = Modifier
                .padding(5.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            verticalAlignment = Alignment.CenterVertically,
        ) {

            when(currentTime()){
                MORNING -> {
                    WeatherCardActive(theWeatherCondition = MORNING_CONDITION, theTime = MORNING, theTemp = MORNING_TEMP)
                    WeatherCardInActive(theWeatherCondition = AFTERNOON_CONDITION, theTime = AFTERNOON, theTemp = AFTERNOON_TEMP)
                    WeatherCardInActive(theWeatherCondition = EVENING_CONDITION, theTime = EVENING, theTemp = EVENING_TEMP)
                    WeatherCardInActive(theWeatherCondition = NIGHT_CONDITION, theTime = NIGHT, theTemp = NIGHT_TEMP)
                }
                AFTERNOON -> {
                    WeatherCardInActive(theWeatherCondition = MORNING_CONDITION, theTime = MORNING, theTemp = MORNING_TEMP)
                    WeatherCardActive(theWeatherCondition = AFTERNOON_CONDITION, theTime = AFTERNOON, theTemp = AFTERNOON_TEMP)
                    WeatherCardInActive(theWeatherCondition = EVENING_CONDITION, theTime = EVENING, theTemp = EVENING_TEMP)
                    WeatherCardInActive(theWeatherCondition = NIGHT_CONDITION, theTime = NIGHT, theTemp = NIGHT_TEMP)
                }
                EVENING -> {
                    WeatherCardInActive(theWeatherCondition = MORNING_CONDITION, theTime = MORNING, theTemp = MORNING_TEMP)
                    WeatherCardInActive(theWeatherCondition = AFTERNOON_CONDITION, theTime = AFTERNOON, theTemp = AFTERNOON_TEMP)
                    WeatherCardActive(theWeatherCondition = EVENING_CONDITION, theTime = EVENING, theTemp = EVENING_TEMP)
                    WeatherCardInActive(theWeatherCondition = NIGHT_CONDITION, theTime = NIGHT, theTemp = NIGHT_TEMP)
                }
                NIGHT -> {
                    WeatherCardInActive(theWeatherCondition = MORNING_CONDITION, theTime = MORNING, theTemp = MORNING_TEMP)
                    WeatherCardInActive(theWeatherCondition = AFTERNOON_CONDITION, theTime = AFTERNOON, theTemp = AFTERNOON_TEMP)
                    WeatherCardInActive(theWeatherCondition = EVENING_CONDITION, theTime = EVENING, theTemp = EVENING_TEMP)
                    WeatherCardActive(theWeatherCondition = NIGHT_CONDITION, theTime = NIGHT, theTemp = NIGHT_TEMP)
                }
            }


        }
    }

}

@Composable
fun WeatherCardActive(theWeatherCondition: String, theTime: String, theTemp:String){

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
                    text = theTime,
                    style = MaterialTheme.typography.h2,
                )
                Image(
                    painter = getPainter(
                        weatherCondition = theWeatherCondition,
                        time = theTime
                    ),
                    alignment = Alignment.Center,
                    modifier = Modifier
                        .height(75.dp),
                    contentDescription = "Weather condition image"
                )

                Text(
                    text = theTemp,
                    style = MaterialTheme.typography.h3,
                )

            }
        }


}

@Composable
fun WeatherCardInActive(theWeatherCondition: String, theTime: String, theTemp:String){

    Box(
        modifier = Modifier
            .padding(10.dp)
    ) {

        Column(
            modifier = Modifier
                .border(brush = gradientCard1, shape = cardShape1 ,width = 0.5.dp)
                .padding(10.dp)
        ) {
            Text(
                text = theTime,
                style = MaterialTheme.typography.h2,
            )
            Image(
                painter = getPainter(
                    weatherCondition = theWeatherCondition,
                    time = theTime
                ),
                alignment = Alignment.Center,
                modifier = Modifier
                    .height(75.dp),
                contentDescription = "Weather condition image"
            )

            Text(
                text = theTemp,
                style = MaterialTheme.typography.h3,
            )

        }
    }


}

@Composable
fun getPainter(weatherCondition: String, time: String):Painter{
    //Painter object
    lateinit var weatherPainter:Painter

    when(weatherCondition){

        WEATHER_CLOUDY -> {
            when(time){
                MORNING -> {
                    weatherPainter = painterResource(id = CLOUDY_SKY_DAY)
                }
                AFTERNOON -> {
                    weatherPainter = painterResource(id = CLOUDY_SKY_DAY)
                }
                EVENING -> {
                    weatherPainter = painterResource(id = CLOUDY_SKY_DAY)
                }
                NIGHT -> {
                    weatherPainter = painterResource(id = CLOUDY_SKY_NIGHT)
                }
            }
        }

        WEATHER_CLEAR -> {
            when(time){
                MORNING -> {
                    weatherPainter = painterResource(id = CLEAR_DAY)
                }
                AFTERNOON -> {
                    weatherPainter = painterResource(id = CLEAR_DAY)
                }
                EVENING -> {
                    weatherPainter = painterResource(id = CLEAR_DAY)
                }
                NIGHT -> {
                    weatherPainter = painterResource(id = CLEAR_NIGHT)
                }
            }
        }

        WEATHER_RAIN -> {
            when(time){
                MORNING -> {
                    weatherPainter = painterResource(id = RAIN_DAY)
                }
                AFTERNOON -> {
                    weatherPainter = painterResource(id = RAIN_DAY)
                }
                EVENING -> {
                    weatherPainter = painterResource(id = RAIN_DAY)
                }
                NIGHT -> {
                    weatherPainter = painterResource(id = RAIN_NIGHT)
                }
            }
        }

        WEATHER_DRIZZLE -> {
            when(time){
                MORNING -> {
                    weatherPainter = painterResource(id = DRIZZLE_DAY)
                }
                AFTERNOON -> {
                    weatherPainter = painterResource(id = DRIZZLE_DAY)
                }
                EVENING -> {
                    weatherPainter = painterResource(id = DRIZZLE_DAY)
                }
                NIGHT -> {
                    weatherPainter = painterResource(id = DRIZZLE_NIGHT)
                }
            }
        }

        WEATHER_SNOW -> {
            when(time){
                MORNING -> {
                    weatherPainter = painterResource(id = SNOW_DAY)
                }
                AFTERNOON -> {
                    weatherPainter = painterResource(id = SNOW_DAY)
                }
                EVENING -> {
                    weatherPainter = painterResource(id = SNOW_DAY)
                }
                NIGHT -> {
                    weatherPainter = painterResource(id = SNOW_NIGHT)
                }
            }
        }

        WEATHER_THUNDERSTORM -> {
            when(time){
                MORNING -> {
                    weatherPainter = painterResource(id = THUNDERSTORM_DAY)
                }
                AFTERNOON -> {
                    weatherPainter = painterResource(id = THUNDERSTORM_DAY)
                }
                EVENING -> {
                    weatherPainter = painterResource(id = THUNDERSTORM_DAY)
                }
                NIGHT -> {
                    weatherPainter = painterResource(id = THUNDERSTORM_NIGHT)
                }
            }
        }

        WEATHER_MIST -> {
            when(time){
                MORNING -> {
                    weatherPainter = painterResource(id = MIST_DAY)
                }
                AFTERNOON -> {
                    weatherPainter = painterResource(id = MIST_DAY)
                }
                EVENING -> {
                    weatherPainter = painterResource(id = MIST_DAY)
                }
                NIGHT -> {
                    weatherPainter = painterResource(id = MIST_NIGHT)
                }
            }
        }



    }

    weatherPainter.let {
        return weatherPainter
    }

}


