package javaprogrammes;

import java.util.Scanner;

/*
8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if  any other alphabet should be invalid entry
 */
public class Programme_8_AlphabetCity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner object for data input

        System.out.print("Enter an alphabet (A to F): ");
        char letter = scanner.next().charAt(0);

            if (letter == 'A' || letter == 'a') { //Should take in both lower and uppercase
                System.out.println("Aberdeen");
            } else if (letter == 'B' || letter == 'b') {
                System.out.println("Bristol");
            } else if (letter == 'C' || letter == 'c') {
                System.out.println("Cardiff");
            } else if (letter == 'D' || letter == 'd') {
                System.out.println("Durham");
            } else if (letter == 'E' || letter == 'e') {
                System.out.println("Edinburgh");
            } else if (letter == 'F' || letter == 'f') {
                System.out.println("Frankfurt");
            } else {
                System.out.println("Invalid entry");
            }
scanner.close();
    }
}
