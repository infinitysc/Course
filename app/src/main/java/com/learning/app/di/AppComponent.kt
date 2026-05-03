package com.learning.app.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent


@Component(
    dependencies = [],
    modules = [],
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context : Context) : AppComponent
    }

}
