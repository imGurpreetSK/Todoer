package com.gurpreetsk.todoer.di

import android.content.Context
import com.gurpreetsk.todoer.TodoerApplication
import com.gurpreetsk.todoer.di.modules.AppModule
import com.gurpreetsk.todoer.di.modules.LogModule
import com.gurpreetsk.todoer.di.modules.NetworkModule
import com.gurpreetsk.todoer.di.modules.StorageModule
import com.gurpreetsk.base.schedulers.AppSchedulers
import com.gurpreetsk.network.StarterApi
import com.gurpreetsk.repository.Repository
import com.gurpreetsk.repository.db.AppDatabase
import com.gurpreetsk.repository.prefs.AppSettings
import dagger.Component
import timber.log.Timber
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    LogModule::class,
    NetworkModule::class,
    StorageModule::class
])
interface AppComponent {
    fun timberTree(): Timber.Tree

    fun schedulerProvider(): AppSchedulers
    fun appDatabase(): AppDatabase
    fun appSettings(): AppSettings
    fun repository(): Repository

    fun apiService(): StarterApi

    companion object {
        fun obtain(context: Context): AppComponent =
                (context.applicationContext as TodoerApplication).component()
    }
}
