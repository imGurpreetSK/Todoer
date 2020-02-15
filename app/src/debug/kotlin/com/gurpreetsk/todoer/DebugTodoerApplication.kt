package com.gurpreetsk.todoer

import com.facebook.stetho.Stetho
import com.gurpreetsk.todoer.di.AppComponent
import com.gurpreetsk.todoer.di.DaggerDebugAppComponent
import com.gurpreetsk.todoer.di.modules.AppModule

class DebugTodoerApplication : TodoerApplication() {
    override fun onCreate() {
        super.onCreate()

        Stetho.initializeWithDefaults(this)
    }

    override fun getAppComponent(): AppComponent {
        return DaggerDebugAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }
}
