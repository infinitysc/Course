package com.learning.app

import android.app.Application
import android.content.Context
import com.learning.app.di.AppComponent
import com.learning.app.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(this)
    }

}


val Context.appComponent : AppComponent
    get() = when(this) {
        is App -> this.appComponent
        else -> (this.applicationContext as App).appComponent
}