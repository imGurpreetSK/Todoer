package com.gurpreetsk.todoer.di.components

import android.content.Context
import com.gurpreetsk.todoer.TodoerApplication
import com.gurpreetsk.todoer.di.AppComponent
import com.gurpreetsk.todoer.di.scopes.ActivityScope
import dagger.Component

@ActivityScope
@Component(dependencies = [AppComponent::class])
interface ActivityComponent {
    // TODO: Define contract

    companion object {
        fun obtain(context: Context): ActivityComponent =
                (context.applicationContext as TodoerApplication).activityComponent()
    }
}
