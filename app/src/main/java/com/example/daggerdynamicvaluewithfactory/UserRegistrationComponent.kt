package com.example.daggerdynamicvaluewithfactory

import dagger.BindsInstance
import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(activity: MainActivity)

    @Component.Factory
    interface Factory{

        fun create(@BindsInstance retryCount:Int):UserRegistrationComponent
    }
}