package com.example.daggerdynamicvaluewithfactory


import dagger.Module
import dagger.Provides

//In  dynamic value with object passing we need to
// pass value to this module class which is used by fun getMessageService()

//But in factory  we bind dynamic value directly to getMessageService()
// which is passed to component while cretaing component using factory
@Module
class NotificationServiceModule() {



    @MessageQualifier
    @Provides
    fun getMessageService(  retryCount:Int):NotificationService{
        return MessageService(retryCount)
    }

    //@Named("email")
    @EmailQualifier
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }
}