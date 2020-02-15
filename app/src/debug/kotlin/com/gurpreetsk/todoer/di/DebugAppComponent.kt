package com.gurpreetsk.todoer.di

import com.gurpreetsk.todoer.di.modules.AppModule
import com.gurpreetsk.todoer.di.modules.DebugLogModule
import com.gurpreetsk.todoer.di.modules.NetworkModule
import com.gurpreetsk.todoer.di.modules.StorageModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    DebugLogModule::class,
    NetworkModule::class,
    StorageModule::class
])
interface DebugAppComponent : AppComponent
