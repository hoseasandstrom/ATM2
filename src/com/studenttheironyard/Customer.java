package com.studenttheironyard;

/**
 * Created by hoseasandstrom on 5/18/16.
 */
public class Customer {

    String name;
    String option;

    public void chooseName() {
        System.out.println("What is your name?");
        String name = Main.scanner.nextLine();
        System.out.println("Welcome " + name);
    }

    public void chooseOption() throws Exception {
        System.out.println("Choose your option: [Check my balance, Withdraw funds, or Cancel transaction]");
        String option = Main.scanner.nextLine();

        if (option.equalsIgnoreCase("Check my balance")) {
            System.out.println("Your balance is $100.00");

        } else if (option.equalsIgnoreCase("Cancel")) {
            System.out.println("Thank you, please come again!");

        } else if (option.equalsIgnoreCase("Withdraw funds")) {
            System.out.println("Enter the amount you wish to withdraw");
            String num = Main.scanner.nextLine();
            int numInt = Integer.valueOf(num);

            if (numInt < 100) {
                System.out.println("Please take you money and have a nice day!");
            } else {
                throw new Exception("You don't have money like that!");

            }
        }

    }
}
