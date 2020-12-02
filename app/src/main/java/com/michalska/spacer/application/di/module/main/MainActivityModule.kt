package com.michalska.spacer.application.di.module.main

import androidx.lifecycle.ViewModel
import com.michalska.spacer.application.PresenterKey

import com.michalska.spacer.feature.main.MainPresenter
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainActivityModule {
    @Binds
    @IntoMap
    @PresenterKey(MainPresenter::class)
    abstract fun bindAlertActivityViewModel(presenter: MainPresenter): ViewModel

}