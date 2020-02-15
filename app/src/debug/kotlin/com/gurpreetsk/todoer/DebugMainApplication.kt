package com.gurpreetsk.todoer

import com.facebook.stetho.Stetho
import com.gurpreetsk.todoer._di.AppComponent
import com.gurpreetsk.todoer._di.DaggerDebugAppComponent
import com.gurpreetsk.todoer._di.modules.AppModule

class DebugMainApplication : MainApplication() {
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
