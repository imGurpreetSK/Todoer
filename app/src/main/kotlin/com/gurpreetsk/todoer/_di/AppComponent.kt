package com.gurpreetsk.todoer._di

import android.content.Context
import com.gurpreetsk.todoer.MainApplication
import com.gurpreetsk.todoer._di.modules.AppModule
import com.gurpreetsk.todoer._di.modules.LogModule
import com.gurpreetsk.todoer._di.modules.NetworkModule
import com.gurpreetsk.todoer._di.modules.StorageModule
import com.gurpreetsk.todoer._http.StarterApi
import com.gurpreetsk.todoer._schedulers.AppSchedulers
import com.gurpreetsk.todoer._storage.Repository
import com.gurpreetsk.todoer._storage.db.AppDatabase
import com.gurpreetsk.todoer._storage.prefs.AppSettings
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
                (context.applicationContext as MainApplication).component()
    }
}
