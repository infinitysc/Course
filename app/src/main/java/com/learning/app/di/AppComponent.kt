package com.learning.app.di

import android.content.Context
import com.learning.data.di.DatabaseModule
import com.learning.data.di.RepositoryModule
import com.learning.data.network.Client
import com.learning.domain.usecases.GetElementsUseCase
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        Client::class,
        RepositoryModule::class,
        DatabaseModule::class
              ],
)
interface AppComponent {

    fun getElementsUseCase() : GetElementsUseCase

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context : Context) : AppComponent
    }

}
