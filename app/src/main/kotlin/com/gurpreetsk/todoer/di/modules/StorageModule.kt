package com.gurpreetsk.todoer.di.modules

import android.content.Context
import com.gurpreetsk.repository.Database
import com.gurpreetsk.repository.Repository
import com.gurpreetsk.repository.RepositoryImpl
import com.gurpreetsk.repository.db.AppDatabase
import com.gurpreetsk.repository.db.SqlDatabase
import com.gurpreetsk.repository.prefs.AppPrefs
import com.gurpreetsk.repository.prefs.AppSettings
import com.gurpreetsk.todoer.BuildConfig.DB_NAME
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
