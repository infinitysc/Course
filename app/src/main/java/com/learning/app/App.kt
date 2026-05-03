package com.learning.app

import android.app.Application
import android.content.Context
import com.learning.app.di.AppComponent
import com.learning.app.di.DaggerAppComponent

class App : Application() {

    lateinit var daggerAppComponent : AppComponent

    override fun onCreate() {

        daggerAppComponent = DaggerAppComponent.factory().create(this)

        super.onCreate()
    }

}


val Context.appComponent : AppComponent
    get() = when(this) {
        is App -> this.appComponent
        else -> this.applicationContext.appComponent
}