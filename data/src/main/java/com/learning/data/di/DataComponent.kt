package com.learning.data.di

import android.content.Context
import com.learning.data.network.Client
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@Component(modules = [
    Client::class,
])
interface DataComponent {



    @Component.Factory
    interface Factory {
        fun create() : DataComponent
    }
}