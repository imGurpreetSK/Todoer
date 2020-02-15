package com.gurpreetsk.base.schedulers

import kotlinx.coroutines.CoroutineDispatcher

// TODO(gs) How can this be decoupled from Rx/Coroutines?
interface AppSchedulers {
    val computation: CoroutineDispatcher
    val io: CoroutineDispatcher
    val ui: CoroutineDispatcher
}
