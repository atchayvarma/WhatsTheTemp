package com.tamilanapps.whatsthetemp.utils

import java.text.SimpleDateFormat
import java.util.*

fun DATE(): String {

    //Calender Date object
    val calDate = Calendar.getInstance().time
    //DateFormatter which formats the date
    val dateFormatter = SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault())

    //Returning the formatted date
    return dateFormatter.format(calDate)
}