/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double gender;

        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        int r = keyboardInput.nextInt();

        if(r == 1){
            gender = 0.73;
        }
        else{
            gender = 0.66;
        }


        System.out.print("How many ounces of alcohol did you have? ");
        int A = keyboardInput.nextInt();

        System.out.print("What is your weight, in pounds?  ");
        int W = keyboardInput.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        int H = keyboardInput.nextInt();



        double Bac = (A * 5.14 / W * gender) - .015 * H;

        System.out.println("Your BAC is " +  String.format("%.6f" ,Bac));
         if(Bac >= 0.08){
             System.out.print("It is not legal for you to drive.");
    }
         else {System.out.print("It is legal for you to drive.");
         }










    }
}
