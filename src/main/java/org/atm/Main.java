package org.atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATMOperationInterface option = new ATMOperationImpl();
    int atmNumber = 12345678;
    int atmPin = 1234;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my ATM Machine");
        System.out.format("Enter Atm Number: ");
        int enteredAtmNumber = Integer.parseInt(scanner.nextLine());
        System.out.format("Enter your pin: ");
        int enteredPin = Integer.parseInt(scanner.nextLine());

        if((atmNumber==enteredAtmNumber)&&(atmPin==enteredPin)){
            while(true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Mini statement\n5.Exit");
                System.out.println("Enter Choice : ");
                int choice=Integer.parseInt(scanner.nextLine());
                if(choice==1){
                   option.viewBalance();
                }
                else if(choice==2){
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount = Double.parseDouble(scanner.nextLine());
                    option.withdrawAmount(withdrawAmount);

                }
                else if(choice==3){
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount= Double.parseDouble(scanner.nextLine());
                    option.depositAmount(depositAmount);

                }
                else if(choice==4){
                  option.viewMiniStatement();

                }
                else if(choice==5){
                    System.out.println("Collect your ATM Card\n Thank you for using Michael's ATM Machine!!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.println("Incorrect Atm Number or pin");
            System.exit(0);
        }


    }
}