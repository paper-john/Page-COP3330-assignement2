package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Page
 */

import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {

        // Declare variable
        Scanner s = new Scanner(System.in);
        float rate;

        // Try makes it so that it loops until the user inputs a number between 55 and 95
        try {
            System.out.print("Enter your Age : "); // gets user age
            int age = s.nextInt();

            System.out.print("Enter your resting heart rate : "); // gets user pulse
            float heart_rate = s.nextFloat();

            // Prints info and formats table
            System.out.println("Resting Pulse : " + heart_rate + "      Age : " + age);
            System.out.println("Intensity   | Rate");
            System.out.println("------------|----------");

            // Calculates heart rate
            for (int i = 55; i <= 95; i += 5) {
                rate = (((220 - age) - heart_rate) * i/100) + heart_rate;
                System.out.println(i + "%" + "         | " + Math.round(rate) + " bpm");
            }

        // Stops user from input outside the allowed range
        } catch(Exception e) {
            System.out.println("Enter only numbers...");
        }
    }
}
