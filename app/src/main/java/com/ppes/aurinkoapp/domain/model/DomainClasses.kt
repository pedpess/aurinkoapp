package com.ppes.aurinkoapp.domain.model

/**
 * Created by ppes on 19/08/2017.
 */

data class ForecastList(val city: String,
                        val country: String,
                        val dailyForecast: List<Forecast>) {

    val size: Int
        get() = dailyForecast.size

    operator fun get(position: Int): Forecast = dailyForecast[position]
}

data class Forecast(val date: String,
                    val description: String,
                    val high: Int,
                    val low: Int)