package com.javatechie.solid.E.dip;

public class CreditCard implements BankCard{
public void doTransaction(long amount){
System.out.println("Paying using credit card");
}
}
