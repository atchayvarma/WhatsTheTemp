package com.tamilanapps.whatsthetemp.utils

fun RANDOM_WEATHER_CONDITION():String{

    lateinit var WeatherCondition:String
    val randomNum = (0..7).random()

    when(randomNum){
        1 -> WeatherCondition = WEATHER_CLOUDY
        2 -> WeatherCondition = WEATHER_CLEAR
        3 -> WeatherCondition = WEATHER_RAIN
        4 -> WeatherCondition = WEATHER_SNOW
        5 -> WeatherCondition = WEATHER_THUNDERSTORM
        6 -> WeatherCondition = WEATHER_MIST
        7 -> WeatherCondition = WEATHER_DRIZZLE
    }

    WeatherCondition.let {
        return it
    }
}