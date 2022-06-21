package com.javatechie.solid.D.isp;

public interface UPIPayments {
    public void payMoney();
    public void getScratchCard();

// Does not supported by phonepe and paytm so let's create another interface having this feature
    ///public void getCashBackAsCreditBalance();
}
