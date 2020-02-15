package com.gurpreetsk.todoer._mvi

import android.os.Parcelable

interface MviView<in T : Parcelable> {
    fun render(state: T)
}
