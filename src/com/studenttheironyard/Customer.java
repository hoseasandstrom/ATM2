package com.studenttheironyard;

import java.util.HashMap;

import static com.studenttheironyard.Main.scanner;

/**
 * Created by hoseasandstrom on 5/18/16.
 */
class Customer {
    String name;
    String option;
    static HashMap<String, Double> account = new HashMap<>();

        public void chooseName () {
        System.out.println("What is your name?");
        name = Main.scanner.nextLine();
        while (account.containsKey("Alice")) ;
        {
            System.out.println("Welcome " + name);
        }

        if (!account.containsKey("Alice")) ;
        {
            System.out.println("Would you like to create an account [y/n]?");
        }
        String answer = Main.scanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            account.put("names", 100.50);
            System.out.println(name + " your account has been created");
        }
    }


    public void chooseOption() {
        System.out.println("Choose your option: [[1]Check my balance, [2]Withdraw funds, [3]Cancel transaction or [4]Delete Your Account]");
        String option = scanner.nextLine();
        if (option.equalsIgnoreCase("1")) {
            System.out.println("Your balance is $100.00");
        } else if (option.equalsIgnoreCase("3")) {
            System.out.println("Thank you, please come again!");
        } else if (option.equalsIgnoreCase("2")) {
            System.out.println("Enter the amount you wish to withdraw");
            java.lang.String num = scanner.nextLine();
            double numDouble = Double.valueOf(num);

            if (numDouble < 100) {
                System.out.println("Please take you money and have a nice day!");
            } else if (numDouble > 100) {
                System.out.println("Insufficient funds");
            }
        } else if (option.equalsIgnoreCase("4")) {
            account.remove("name", 100.00);
            System.out.println("Your account has been deleted. Thank you and have a wonderful day!");
        }
    }
}






