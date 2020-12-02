package com.michalska.spacer.application

import com.facebook.stetho.BuildConfig
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import com.facebook.stetho.Stetho
import com.jakewharton.threetenabp.AndroidThreeTen
import com.michalska.spacer.application.di.DaggerSpacerComponent
import timber.log.Timber

class SpacerApp : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerSpacerComponent.builder().create(this)
    }

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        AndroidThreeTen.init(this)
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }
}