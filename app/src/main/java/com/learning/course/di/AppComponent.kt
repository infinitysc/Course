package com.learning.course.di

import android.content.Context
import com.learning.data.di.DataComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Inject


@Component(dependencies = [DataComponent::class], modules = [])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context : Context,dataComponent: DataComponent) : AppComponent
    }

}