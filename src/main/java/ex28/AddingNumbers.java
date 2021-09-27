package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Page
 */

import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args) {

        //Gets input from user
        Scanner in = new Scanner(System.in);

        int total = 0;

        //Gets 5 inputs
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            total += in.nextInt();
        }
        System.out.println("The total is " + total + ".");
    }
}
