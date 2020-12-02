package com.michalska.spacer.application.base

interface BasePresenterInterface<ViewType> {
    fun attach(view: ViewType)
}