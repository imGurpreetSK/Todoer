package com.gurpreetsk.todoer._di

import com.gurpreetsk.todoer._di.modules.AppModule
import com.gurpreetsk.todoer._di.modules.DebugLogModule
import com.gurpreetsk.todoer._di.modules.NetworkModule
import com.gurpreetsk.todoer._di.modules.StorageModule
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
