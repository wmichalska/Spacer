package com.michalska.spacer.feature.splashScreen

import com.michalska.spacer.application.base.BasePresenterInterface


interface SplashScreenContract {

    interface View {
        fun goToMain()
    }

    interface Presenter : BasePresenterInterface<View> {
        fun loadSettings()
    }
}