package com.michalska.spacer.feature.main

import com.michalska.spacer.application.base.BasePresenterInterface


interface MainContract {
    interface View {
    }

    interface Presenter : BasePresenterInterface<View> {
    }
}