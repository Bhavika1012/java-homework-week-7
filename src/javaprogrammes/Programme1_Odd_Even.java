package javaprogrammes;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme1_Odd_Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Creating scanner object to read input from user
        System.out.println("Enter a number: ");
        int num = scanner.nextInt(); //Reading input from user
        String result = (num % 2 == 0) ? "even" : "odd"; // Using ternary operator to check if num is odd or even
        /*
         * If the remainder of the number divided by 2 is equal to 0 then the number is even, if not then it is odd.
         * The ternary operator is used to assign the corresponding string value to the result variable.
         */
        System.out.println(num + " is "  + result);
        scanner.close();
    }
}
