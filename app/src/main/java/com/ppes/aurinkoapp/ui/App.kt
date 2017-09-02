package com.ppes.aurinkoapp.ui

import android.app.Application

/**
 * Created by ppes on 02/09/2017.
 */
class App : Application() {
    companion object {
        private var instance: Application? = null
        fun instance() = instance!!
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}