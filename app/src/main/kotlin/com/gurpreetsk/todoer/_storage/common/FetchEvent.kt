package com.gurpreetsk.todoer._storage.common

data class FetchEvent<out T>(
        val fetchAction: FetchAction,
        val result: T?,
        val errors: List<ApplicationError> = emptyList()
)
