package com.javatechie.solid.A.srp;

public class BankService {

    public long deposit(long amount, String accountNo){
        // deposit amount
        return 0;
    }
    public void printPassBook(){
        //update transaction info in the passbook
    }
    public void getLoanInterestInfo(String loanType){
        if(loanType.equals("homeloan")){
            // do some job for homeloan
        }
        if(loanType.equals("personalloan")){
            //do some job for personal loan
        }
        if(loanType.equals("car")){
            //do some job for car loan
        }
    }
    public void sentOTP(String medium){
        if(medium.equals("email")){
            // use javaMailSenderAPI
        }
    }
}
