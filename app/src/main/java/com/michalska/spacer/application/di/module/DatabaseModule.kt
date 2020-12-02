package com.michalska.spacer.application.di.module

import android.content.Context
import androidx.room.Room
import com.michalska.spacer.persistence.SpacerDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class DatabaseModule {
    @Module
    companion object {
        private const val DATABASE_MODULE = "SpacerRoomDatabase"

        @Provides
        @Singleton
        @JvmStatic
        fun provideSpacerDatabase(context: Context): SpacerDatabase {
            return Room.databaseBuilder(
                context, SpacerDatabase::class.java,
                DATABASE_MODULE
            ).fallbackToDestructiveMigration().build()
        }

        @Provides
        @JvmStatic
        fun provideMessageDao(database: SpacerDatabase) = database.dogDao()


    }
}