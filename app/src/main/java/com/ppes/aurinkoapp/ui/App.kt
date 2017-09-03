package com.ppes.aurinkoapp.ui

import android.app.Application
import com.ppes.aurinkoapp.ui.utils.DelegatesExt

/**
 * Created by ppes on 02/09/2017.
 */
class App : Application() {
    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}