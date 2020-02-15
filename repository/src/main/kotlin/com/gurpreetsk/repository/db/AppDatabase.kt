package com.gurpreetsk.repository.db

import com.gurpreetsk.repository.Database

interface AppDatabase

class SqlDatabase(val database: Database) : AppDatabase
