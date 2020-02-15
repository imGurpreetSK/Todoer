package com.gurpreetsk.repository.prefs

interface AppSettings {
    fun putString(key: String, value: String)
    fun getString(key: String, defaultValue: String): String?
}
