package com.michalska.spacer.feature.splashScreen

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.michalska.spacer.R
import com.michalska.spacer.application.base.BaseActivity
import com.michalska.spacer.feature.main.MainActivity

import javax.inject.Inject

class SplashScreenActivity : BaseActivity(), SplashScreenContract.View {

    @Inject
    lateinit var presenterFactory: ViewModelProvider.Factory
    private lateinit var presenter: SplashScreenContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        presenter =
            ViewModelProvider(this, presenterFactory).get(SplashScreenPresenter::class.java)
        presenter.attach(this)
        presenter.loadSettings()
    }

    override fun goToMain() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}