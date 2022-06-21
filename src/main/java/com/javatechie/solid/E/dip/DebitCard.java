package com.javatechie.solid.E.dip;

public class DebitCard implements BankCard{
public void doTransaction(long amount){
    System.out.println("Paying using Debit Card");
}
}
