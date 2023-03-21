package javaprogrammes;

import java.util.Scanner;

/*
12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme_12_Input_Value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Creating scanner object to read the user input
        System.out.println("Enter a character");
        String input = scanner.nextLine();  //Storing user input

        if (input.matches("[0-9]+")){ //Check if user input is a number
            System.out.println(input + " is a number.");
        }
        else if (input.matches("[a-z,A-Z]+")){
            System.out.println(input + " is an alphabet."); //Check if it's an alphabet
        }
        else {
            System.out.println(input + " is a symbol."); //If its none of the above then it is a symbol
        }
     scanner.close();
    }
}
