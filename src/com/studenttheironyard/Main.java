package com.studenttheironyard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        boolean run = true;
        while (run) {
            System.out.println("Welcome!");


            Customer customer = new Customer();
            customer.chooseName();
            customer.chooseOption();


        }
    }
}

