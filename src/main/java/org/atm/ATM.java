package org.atm;

public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    //Default constructor
    public ATM(){
        balance = 0.00;
        depositAmount =0.00;
        withdrawAmount =0.00;
    }

    // getter and setter
    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getDepositAmount(){
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount){
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount(){
        return withdrawAmount;
    }
    public void setWithdrawAmount(double withdrawAmount){
        this.withdrawAmount = withdrawAmount;
    }

}
