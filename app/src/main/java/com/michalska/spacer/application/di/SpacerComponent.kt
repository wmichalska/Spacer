package com.michalska.spacer.application.di

import com.michalska.spacer.application.PresenterFactoryBuilder
import com.michalska.spacer.application.SpacerApp
import com.michalska.spacer.application.di.module.ActivityBuilderModule
import com.michalska.spacer.application.di.module.DatabaseModule
import com.michalska.spacer.application.di.module.SpacerModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        SpacerModule::class,
        ActivityBuilderModule::class,
        PresenterFactoryBuilder::class,
        DatabaseModule::class]
)
interface SpacerComponent : AndroidInjector<SpacerApp> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<SpacerApp>()
}