package com.tamilanapps.whatsthetemp.utils

import java.util.*



//Function that checks whether its day or not
fun Day(): Boolean {
    //Calender object and Hours object
    val cal: Calendar = Calendar.getInstance()
    val hours = cal.get(Calendar.HOUR)

    //If time is above 7'0 clock
    if(hours <= 17) return false
    return true
   }


