package com.gurpreetsk.todoer.di.components

import android.content.Context
import com.gurpreetsk.todoer.TodoerApplication
import com.gurpreetsk.todoer.di.AppComponent
import com.gurpreetsk.todoer.di.scopes.FragmentScope
import dagger.Component

@FragmentScope
@Component(dependencies = [AppComponent::class])
interface FragmentComponent {
    // TODO: Define contract

    companion object {
        fun obtain(context: Context): FragmentComponent =
                (context.applicationContext as TodoerApplication).fragmentComponent()
    }
}
