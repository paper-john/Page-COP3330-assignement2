package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Page
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PickWinner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//get user input
        String name = null;

        // Creates an array for storing names
        ArrayList<String> nameList = new ArrayList<String>();

        //start a do-while loop to take name
        do {
            System.out.println("Enter a name:");
            name= input.nextLine();//get the name from user

            //add the name to the array list
            if(!name.isBlank() && !name.isEmpty())
                nameList.add(name);
        }while(!name.isBlank() && !name.isEmpty()); // if the user enter nothing the loop ends

        //Generate a random index
        Random random = new Random();
        int randomIndex = random.nextInt(nameList.size());

        //pick the winner randomly from the list
        System.out.println("The winner is... "+nameList.get(randomIndex));

    }

}
