package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Page
 */

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        // List of responses from the ball
        String[] responses = {"Yes","No","Maybe","Ask again later"};

        // Declare rand variable
        Random random = new Random();

        // Declare scan
        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.println("What's your question?");
        String question = sc.nextLine();


        int randomResponseIndex = random.nextInt(responses.length);

        String response = responses[randomResponseIndex];

        // Prints random response
        System.out.println();
        System.out.println(response);
        System.out.println();
    }
}
