package com.learning.course

import android.app.Application
import android.content.Context
import com.learning.course.di.AppComponent
import com.learning.course.di.DaggerAppComponent
import com.learning.data.di.DaggerDataComponent
import com.learning.data.di.DataComponent
import javax.inject.Inject

class App : Application(){

    lateinit var dataComponent: DataComponent
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        dataComponent = DaggerDataComponent.factory().create()
        appComponent = DaggerAppComponent.factory().create(context = this, dataComponent = dataComponent)
    }


}

val Context.appComponent : AppComponent
    get() = when(this) {
        is App -> this.appComponent
        else -> this.applicationContext.appComponent
    }