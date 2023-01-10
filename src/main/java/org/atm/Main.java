package org.atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                int choice=scanner.nextInt();
                if(choice==1){
                    System.out.println("View Balance");
                }
                else if(choice==2){
                    System.out.println("Enter amount to withdraw ");
                    scanner.nextDouble();

                }
                else if(choice==3){
                    System.out.println("Enter Amount to Deposit :");
                    scanner.nextDouble();//5000

                }
                else if(choice==4){
                    System.out.println("View Mini statement");

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