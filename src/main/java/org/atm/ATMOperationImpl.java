package org.atm;

import java.util.HashMap;
import java.util.Map;

public class ATMOperationImpl implements  ATMOperationInterface{
    ATM atm = new ATM();
   Map<Double, String> statement = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        //Adding one more if/else statement in case you want your atm to give out cash in multiple
        //of something for example 500 (instead use the inner if/else statement)
        if(withdrawAmount % 500 == 0){
            if(withdrawAmount <=atm.getBalance()){
                statement.put(withdrawAmount, " Cash Withdrawn");
                System.out.println("Collect the Cash " + withdrawAmount );
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else{
                System.out.println("Insufficient fund!!");
            }
        }else {
            System.out.println("Please enter the amount in multiple of 500");
        }

    }

    @Override
    public void depositAmount(double depositAmount) {
        statement.put(depositAmount, " Cash Deposited");
        System.out.println(depositAmount + " Deposited Successfully!!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
    for(Map.Entry<Double,String> m:statement.entrySet()){
        System.out.println(m.getKey() + "" + m.getValue());
    }
    }
}
