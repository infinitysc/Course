package com.learning.data.di

import com.learning.data.network.Client
import dagger.Component

@Component(modules = [
    Client::class,
])
interface Component {



    @Component.Factory
    interface Factory {
        fun create() : com.learning.data.di.Component
    }
}