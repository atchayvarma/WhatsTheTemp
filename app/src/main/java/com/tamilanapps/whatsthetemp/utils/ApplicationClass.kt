package com.tamilanapps.whatsthetemp.utils

import android.app.Application
import android.content.Context



    lateinit var appContext:Context


    class ApplicationClass:Application(){
     override fun onCreate() {
        super.onCreate()
        appContext = this
    }
        }

    fun applicationContext():Context {
        return appContext
    }



