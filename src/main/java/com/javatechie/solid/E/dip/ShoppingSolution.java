package com.javatechie.solid.E.dip;

public class ShoppingSolution {

    private BankCard bankCard;

    public ShoppingSolution(BankCard bankCard) {
        this.bankCard = bankCard;
    }
    public void purchase(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {

        //BankCard bankCard1= new DebitCard();
        BankCard bankCard1= new CreditCard();
// only above line needs to change at run time, called runtime polymorphysm
        ShoppingSolution solution = new ShoppingSolution(bankCard1);
        solution.purchase(5000);

    }
}
