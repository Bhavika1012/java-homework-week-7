package javaprogrammes;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme_6_Odd_Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner object created

        System.out.println("Enter a number: ");
        int num = scanner.nextInt(); //read and store user input
        if (num % 2 == 0) //check if number is even and if it is, print the below message
        System.out.println(num + " is an even number");
        else //if number is not even then it should print the below message
        System.out.println(num + " is an odd number");

        scanner.close();
    }
}
