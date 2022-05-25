package com.example.daggerdynamicvaluewithfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //here we are creating notification service module object and
        //passing to component
        /*val component = DaggerUserRegistrationComponent
            .builder()
            .notificationServiceModule(NotificationServiceModule(3))
            .build()*/


        //Dynamic value with factory

        val component = DaggerUserRegistrationComponent.factory().create(3)



        component.inject(this)

        userRegistrationService.registerUser("sunil@yopmail.com","1234")
    }
}