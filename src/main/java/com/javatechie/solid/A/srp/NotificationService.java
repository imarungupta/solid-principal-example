package com.javatechie.solid.A.srp;

// Only OTP related responsibility
public class NotificationService {

    public void sentOTP(String medium){
        if(medium.equals("email")){
            // use javaMailSenderAPI
        }
        if(medium.equals("mobile")){
            //do your job
        }
    }
}
