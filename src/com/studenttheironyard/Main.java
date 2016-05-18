package com.studenttheironyard;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome!");

        Customer customer = new Customer();

        customer.chooseName();
        customer.chooseOption();


    }
}
