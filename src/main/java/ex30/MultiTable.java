package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Page
 */

public class MultiTable {
    public static void main(String[] args)
    {
        //Prints the multiplication table up to 12x12
        for(int i=1;i<=12;i++)
        {
            for(int j=1;j<=12;j++)
            {
                System.out.print((i*j)+"\t");
            }
            System.out.println();
        }
    }
}
