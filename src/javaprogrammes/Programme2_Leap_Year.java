package javaprogrammes;
/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

import java.util.Scanner;

public class Programme2_Leap_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //Creating a scanner object to read input
        System.out.println("Enter a year: ");
        int year = scanner.nextInt(); //Storing user input
        boolean leapYear = false; //leapYear variable to false

        /*
        A year is only a leap year if it is divisible by 4 but not by 100 - except 400. So we have to check these
        conditions using if else statement.
         */

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                }
            } else {
                leapYear = true;
            }
        }

        if (year / 4 * 4 == year) ; //Checking to see if input is divisible by 4

        if (leapYear) {
            System.out.println(year + " is a leap year."); //print to see if it is a leap year
        } else {
            System.out.println(year + " is not a leap year"); //else statement to be printed if not a leap year
            scanner.close();
        }
    }
}
