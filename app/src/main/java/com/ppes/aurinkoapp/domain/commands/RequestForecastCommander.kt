package com.ppes.aurinkoapp.domain.commands

import com.ppes.aurinkoapp.data.ForecastRequest
import com.ppes.aurinkoapp.domain.mapper.ForecastDataMapper
import com.ppes.aurinkoapp.domain.model.ForecastList

/**
 * Created by ppes on 19/08/2017.
 */

class RequestForecastCommander(val zipCode: String) :
        Command<ForecastList> {

    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }

}