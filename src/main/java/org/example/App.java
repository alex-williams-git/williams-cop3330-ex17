/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double blood_alcohol = 0;

        System.out.print("Enter a 1 if you are a male or a 2 if you are a female: ");
        int gender = scan.nextInt();

        System.out.print("How many ounces of alcohol did you have? ");
        int alcohol_ounces = scan.nextInt();

        System.out.print("What is your weight in pounds? ");
        int weight = scan.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        int hours = scan.nextInt();

        if(gender == 1){
            blood_alcohol = ((alcohol_ounces * 5.14) / (weight * 0.73)) - 0.015 * hours;
        }else if(gender == 2){
            blood_alcohol = ((alcohol_ounces * 5.14) / (weight * 0.66)) - 0.015 * hours;;
        }else{
            System.out.println("You have provided an invalid gender number.");
            System.exit(0);
        }

        if(blood_alcohol <= 0.08){
            System.out.println("Your BAC is " + blood_alcohol);
            System.out.println("It is legal for you to drive.");
        }else{
            System.out.println("Your BAC is " + blood_alcohol);
            System.out.println("It is not legal for you to drive.");
        }
    }
}
