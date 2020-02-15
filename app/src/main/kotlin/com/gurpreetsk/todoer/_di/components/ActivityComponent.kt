package com.gurpreetsk.todoer._di.components

import android.content.Context
import com.gurpreetsk.todoer.MainApplication
import com.gurpreetsk.todoer._di.AppComponent
import com.gurpreetsk.todoer._di.scopes.ActivityScope
import dagger.Component

@ActivityScope
@Component(dependencies = [AppComponent::class])
interface ActivityComponent {
    // TODO: Define contract

    companion object {
        fun obtain(context: Context): ActivityComponent =
                (context.applicationContext as MainApplication).activityComponent()
    }
}
