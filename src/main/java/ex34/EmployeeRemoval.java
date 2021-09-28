package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Page
 */

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeRemoval {

    // This function removes the name from the array
    boolean removeName(ArrayList names,String del)
    {

        return names.remove(del);

    }

    public static void main(String []args)
    {

        EmployeeRemoval obj=new EmployeeRemoval();

        // Creates an array list with the names of employees
        ArrayList<String> names=new ArrayList();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        System.out.println(names); //Prints list of names

        // Gets the name to be removed from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name to delete");
        String del=sc.nextLine();
        obj.removeName(names,del);
        System.out.println(names); //Prints list of names
    }
}