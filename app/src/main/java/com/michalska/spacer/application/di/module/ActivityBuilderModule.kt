package com.michalska.spacer.application.di.module

import com.michalska.spacer.application.di.module.main.MainActivityModule
import com.michalska.spacer.feature.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun mainActivity(): MainActivity

}