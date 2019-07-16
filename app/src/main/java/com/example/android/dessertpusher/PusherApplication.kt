package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

/**
 *****************************************************************
 * Created By Mubanga on 7/16/2019
 *****************************************************************
 */
class PusherApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // This Essentially Establishes Timber's Logging Capabilities Application Wide
        Timber.plant(Timber.DebugTree())
    }
}