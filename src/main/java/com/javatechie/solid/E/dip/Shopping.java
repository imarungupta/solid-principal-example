package com.javatechie.solid.E.dip;

public class Shopping {
private DebitCard debitCard;

public Shopping(DebitCard debitCard) {
    this.debitCard = debitCard;
}
public void doPurchase(long amount){
    debitCard.doTransaction(amount);
}
public static void main(String[] args) {
    DebitCard debitCard1 = new DebitCard();
    Shopping shopping = new Shopping(debitCard1);
    shopping.doPurchase(5000);
}
}
