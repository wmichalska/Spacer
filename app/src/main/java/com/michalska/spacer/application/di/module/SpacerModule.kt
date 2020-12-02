package com.michalska.spacer.application.di.module

import android.content.Context
import android.content.SharedPreferences
import com.michalska.spacer.application.SpacerApp
import com.michalska.spacer.application.ThreadManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class SpacerModule {

    @Module
    companion object {
        @Provides
        @Singleton
        @JvmStatic
        fun provideAppContext(spacerApp: SpacerApp): Context =
            spacerApp.applicationContext

        @Provides
        @Singleton
        @JvmStatic
        fun provideSharedPreferences(context: Context): SharedPreferences =
            context.getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE)

        @Provides
        @Singleton
        @JvmStatic
        fun provideSpacerSettings(sharedPreferences: SharedPreferences) =
            SpacerSettings(sharedPreferences)

        @Provides
        @Singleton
        @JvmStatic
        fun provideThreadManager() =
            ThreadManager()


        private const val PREFS_FILENAME = "com.capgemini.Spacer.prefs"
    }
}