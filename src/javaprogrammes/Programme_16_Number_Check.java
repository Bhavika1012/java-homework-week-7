package javaprogrammes;

import java.util.Scanner;

/*
16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”
 */
public class Programme_16_Number_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Create scanner object for user input
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println(number + " is a positive number");
        } else if (number < 0){
            System.out.println(number + " is a negative number");
        } else if (number == 0){
            System.out.println(number + " is zero");
        }
        scanner.close();

    }
}
