package com.gurpreetsk.todoer._di.modules

import android.content.Context
import com.gurpreetsk.todoer.BuildConfig.DB_NAME
import com.gurpreetsk.todoer.Database
import com.gurpreetsk.todoer._storage.Repository
import com.gurpreetsk.todoer._storage.RepositoryImpl
import com.gurpreetsk.todoer._storage.db.AppDatabase
import com.gurpreetsk.todoer._storage.db.SqlDatabase
import com.gurpreetsk.todoer._storage.prefs.AppSettings
import com.gurpreetsk.todoer._storage.prefs.AppPrefs
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object StorageModule {
    @JvmStatic
    @Provides
    @Singleton
    fun provideDatabaseDriver(context: Context): SqlDriver =
            AndroidSqliteDriver(Database.Schema, context, DB_NAME)

    @JvmStatic
    @Provides
    @Singleton
    fun provideAppDatabase(driver: SqlDriver): AppDatabase =
            SqlDatabase(Database(driver))

    @JvmStatic
    @Provides
    @Singleton
    fun appSettings(context: Context): AppSettings =
            AppPrefs(context)

    @JvmStatic
    @Provides
    @Singleton
    fun repository(): Repository = RepositoryImpl()
}
