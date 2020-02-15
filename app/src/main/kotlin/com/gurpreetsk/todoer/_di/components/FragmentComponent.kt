package com.gurpreetsk.todoer._di.components

import android.content.Context
import com.gurpreetsk.todoer.MainApplication
import com.gurpreetsk.todoer._di.AppComponent
import com.gurpreetsk.todoer._di.scopes.FragmentScope
import dagger.Component

@FragmentScope
@Component(dependencies = [AppComponent::class])
interface FragmentComponent {
    // TODO: Define contract

    companion object {
        fun obtain(context: Context): FragmentComponent =
                (context.applicationContext as MainApplication).fragmentComponent()
    }
}
