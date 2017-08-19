package com.ppes.aurinkoapp.network

import android.util.Log
import java.net.URL

/**
 * Created by ppes on 19/08/2017.
 */

class Request(val url: String) {

    fun run() {
        val forecastJsonString = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonString)
    }
}