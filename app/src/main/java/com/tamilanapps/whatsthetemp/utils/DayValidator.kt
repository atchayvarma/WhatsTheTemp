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


