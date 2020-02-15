package com.gurpreetsk.base.common

data class FetchEvent<out T>(
        val fetchAction: FetchAction,
        val result: T?,
        val errors: List<ApplicationError> = emptyList()
)
