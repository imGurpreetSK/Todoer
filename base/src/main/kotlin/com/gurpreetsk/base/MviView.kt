package com.gurpreetsk.base

import android.os.Parcelable

interface MviView<in T : Parcelable> {
    fun render(state: T)
}
