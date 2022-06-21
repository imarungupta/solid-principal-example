package com.javatechie.solid.A.srp;

// Only Loan related responsibility
public class LoanService {

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
}
