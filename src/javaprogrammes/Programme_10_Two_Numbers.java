package javaprogrammes;

import java.util.Scanner;

/*
10.Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *) find addition, Subtraction, multiplication and division according to their symbol  (using if else)
 */
public class Programme_10_Two_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Creating scanner object to read user input
        System.out.println("Enter first number");
        double num1 = scanner.nextDouble(); //Read and store users input in a double variable

        System.out.println("Enter second number");
        double num2 = scanner.nextDouble(); //Read and store second number

        System.out.println("Enter symbol required for the equation (+, -, *, /)");
        char calculation = scanner.next().charAt(0); //Read the user input and store first character in a variable

        double result; // Declaring variable to store result

        if (calculation == '+') { //Using if statement perform the right calculation depending on users input
            result = num1 + num2;
            System.out.println(num1 + "+"  + num2 + "=" + result);
        } else if (calculation == '-') {
            ;
            result = num1 - num2;
            System.out.println(num1 + "-" + num2 + " = " + result);
        } else if (calculation == '/') {
            if (num2 == 0 ){ //if statement to check for number dividing by zero
                System.out.println("Error: Number cannot be divided by zero");
            } else {
                result = num1 / num2;
                System.out.println(num1 + " / "+ num2 +"=" +result);
            }
        } else if (calculation == '*'){
            result=num1*num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        } else { //for invalid calculation
            System.out.println("Invalid calculation");
            scanner.close();
        }

    }
}
