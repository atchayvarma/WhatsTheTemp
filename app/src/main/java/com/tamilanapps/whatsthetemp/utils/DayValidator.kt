package com.tamilanapps.whatsthetemp.utils

import java.util.*



//Function that checks whether its day or not
fun notDay(): Boolean {
    //Calender object and Hours object
    val cal: Calendar = Calendar.getInstance()
    val hours = cal.get(Calendar.HOUR)

    //If time is above 7'0 clock
    return hours > 19

   }

fun currentTime(): String {
    //Calender object and Hours object
    val cal: Calendar = Calendar.getInstance()
    val hours = cal.get(Calendar.HOUR)

    //Time
    lateinit var time:String


        if(hours >= 0){
            time = MORNING
        }
        if(hours >= 12){
            time = AFTERNOON
        }
        if(hours >= 15){
            time = EVENING
        }
       if(hours >= 19){
            time = NIGHT
        }

      time.let {theTime ->
          return theTime
      }


}




