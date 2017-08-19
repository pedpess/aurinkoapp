package com.ppes.aurinkoapp.ui.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.ppes.aurinkoapp.R
import com.ppes.aurinkoapp.data.ForecastRequest
import com.ppes.aurinkoapp.ui.adapters.ForecastListAdapter
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.longToast
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {

    private val items = listOf(
            "Mon 23/06 - Sunny - 31/17",
            "Tue 24/06 - Foggy - 21/08",
            "Wed 25/06 - Cloudy - 22/17",
            "Thurs 26/06 - Rainy - 18/11",
            "Fri 27/06 - Foggy - 21/10",
            "Sat 28/06 - TRAPPED IN WEATHERSTATION - 23/18",
            "Sun 29/06 - Sunny - 20/07"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forecastList = findViewById<RecyclerView>(R.id.forecast_list) as RecyclerView
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(items)

        val url = "http://api.openweathermap.org/data/2.5/forecast/daily?" +
                "APPID=15646a06818f61f7b8d7823ca833e1ce&q=94043&mode=json&units=metric&cnt=7";

        doAsync {
            ForecastRequest(url).run()
            uiThread { longToast("Request performed") }
        }


    }
}
