package com.studenttheironyard;

import java.util.ArrayList;
import java.util.HashMap;

import static com.studenttheironyard.Main.scanner;

/**
 * Created by hoseasandstrom on 5/18/16.
 */
public class Customer {

    String name;
    String option;
    String account;
    Double balance;

    public static void main(String[] args) {

        HashMap<String, Double> account = new HashMap<>();
        account.put("Alice", 500.50);
        account.put("Bob", 1000.50);
        account.put("Charlie", 1500.50);

        double balance = account.get(2);

    }


    public void chooseName() throws Exception {
        System.out.println("What is your name?");
        name = scanner.nextLine();

        if (option.equalsIgnoreCase("Alice, Bob, Charlie")); {
            System.out.println("Welcome" + name);
        }
        else if {
            System.out.println("You do not have an account, would you like to open one[y/n]?"));
            if (option.equalsIgnoreCase("y")) ; {
                System.out.println("Your account has been created. Please continue.");
            }
            else {throw new Exception("You may not continue without an account. Goodbye.");
            }

        }
    }
    public void chooseOption() throws Exception {
        System.out.println("Choose your option: [Check my balance, Withdraw funds, or Cancel transaction]");
        String option = scanner.nextLine();

        if (option.equalsIgnoreCase("Check my balance")) {
            System.out.println("Your balance is $100.00");
        }
        else if (option.equalsIgnoreCase("Cancel")) {
            System.out.println("Thank you, please come again!");
        }
        else if (option.equalsIgnoreCase("Withdraw funds")) {
            System.out.println("Enter the amount you wish to withdraw");
            String num = scanner.nextLine();
            double numDouble = Double.valueOf(num);

            if (numDouble < 100) {
                System.out.println("Please take you money and have a nice day!");
            } else {
                throw new Exception("You don't have money like that!");

            }
        }
        else if (option.equalsIgnoreCase("Delete account? [y/n]")) {
            if (option.equalsIgnoreCase("y")) ;
            System.out.println("Are you sure? [y/n]");
                if (option.equalsIgnoreCase("y")); {
                System.out.println("Your account has been deleted. Thank you and have a wonderful day!");
            }
                else if(option.equalsIgnoreCase("n")); {
                System.out.println("Your account has not been deleted.");
            }
            else if(option.equalsIgnoreCase("n")); {
                System.out.println("");
            }
            }
        }




    }

