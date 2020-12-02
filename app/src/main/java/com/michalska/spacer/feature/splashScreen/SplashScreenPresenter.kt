package com.michalska.spacer.feature.splashScreen

import android.os.Handler
import com.michalska.spacer.application.base.BasePresenter
import javax.inject.Inject

class SplashScreenPresenter @Inject constructor(
) : BasePresenter<SplashScreenContract.View>(),
        SplashScreenContract.Presenter {

    override fun loadSettings() {
        Handler().postDelayed(
                {
                    getScreen()?.goToMain()
                },
                SPLASH_DISPLAY_LENGTH
        )
    }

    companion object {
        private const val SPLASH_DISPLAY_LENGTH: Long = 4000
    }
}