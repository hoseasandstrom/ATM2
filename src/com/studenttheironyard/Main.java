package com.studenttheironyard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Person person = new Person();

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome!");

        person.chooseName();
        person.chooseOption();

    }
}

