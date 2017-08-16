package com.ppes.aurinkoapp.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.ppes.aurinkoapp.R
import com.ppes.aurinkoapp.adapters.ForecastListAdapter

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


    }
}
