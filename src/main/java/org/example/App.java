package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables
        double princ, rate, years, end;
        Scanner sc = new Scanner(System.in);

        //take user input
        System.out.println("Enter the principal: ");
        princ = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        rate = sc.nextDouble();
        System.out.println("Enter the number of years: ");
        years = sc.nextDouble();

        //calculate and round the investment
        end = princ * (1 + ((rate/100) * years));
        end = Math.round(end*100.0)/100.0;

        //print out findings
        System.out.println("After " + (int)years + " years at " + rate + "%, the investment will be worth $" + end);

        sc.close();
    }
}