package com.gurpreetsk.todoer._storage.db

import com.gurpreetsk.todoer.Database

interface AppDatabase

class SqlDatabase(val database: Database) : AppDatabase
