package com.studenttheironyard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static HashMap<String, Double> account = new HashMap<>();


    public static void main(String[] args) throws Exception {
        boolean run = true;
        while (run) {
            System.out.println("Welcome!");


            Customer customer = new Customer();
            boolean isValid = customer.chooseName();
            if (!isValid) {
                continue;
            }

            customer.chooseOption();


        }
    }
}

