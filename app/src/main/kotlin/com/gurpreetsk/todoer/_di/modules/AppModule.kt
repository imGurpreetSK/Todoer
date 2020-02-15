package com.gurpreetsk.todoer._di.modules

import android.app.Application
import android.content.Context
import com.gurpreetsk.todoer._schedulers.AppSchedulers
import com.gurpreetsk.todoer._schedulers.CoroutineSchedulers
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val application: Application) {
    @Provides
    @Singleton
    fun provideAppContext(): Context = application

    @Provides
    fun providesSchedulers(): AppSchedulers = CoroutineSchedulers()
}
