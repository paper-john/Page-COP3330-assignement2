package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Page
 */

import java.util.*;


public class NumberGame {

    public static void main(String[] args) {

        // Get user input
        System.out.println("Let's play Guess the Number!");
        int secretNumber;
        secretNumber = (int) (Math.random() * 999 + 1); //randomly generate the number to guess
        Scanner sc = new Scanner(System.in);
        int guess,total=0,key;

        while(true){

            total=0;
            //prompt the user for output
            System.out.print("Enter the difficulty level(1, 2, or  3): ");
            key=sc.nextInt();

            //check for difficulty level
            if(key==1)
                secretNumber = (int) (Math.random() * 10 + 1);
            else if(key==2)
                secretNumber = (int) (Math.random() * 100 + 1);
            else
                secretNumber = (int) (Math.random() * 1000 + 1);

            //Loop until the user inputs the right number
            System.out.print("I have my number. What's your guess?: ");
            do{
                guess = sc.nextInt();
                total++; //count the guess
                if (guess == secretNumber){
                    System.out.println("You got it in "+total+"  guesses!");
                }
                else if (guess < secretNumber)
                    System.out.println("Too low. Guess again: ");
                else if (guess > secretNumber)
                    System.out.println("Too high. Guess again: ");

            }while (guess != secretNumber);

            //prompt the user if they want to play again
            System.out.print("\nDo you wish to play again (Y/N)?  ");
            char s=sc.next().charAt(0);
            if(s=='N' || s=='n')
                break;
        }

    }
}
