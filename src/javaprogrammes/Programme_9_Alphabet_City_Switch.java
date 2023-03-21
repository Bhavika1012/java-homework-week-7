package javaprogrammes;

import java.util.Scanner;

/*
9. Same as above program-8 using switch statement.
 */
public class Programme_9_Alphabet_City_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Creating scanner object to read input from user
        System.out.println("Enter a letter from A to F");
        String letter = scanner.next().toUpperCase(); //Read the input letter as a string;

        switch (letter) {
            case "A":
                System.out.println("A City name beginning with A is: Aberdeen");
                break;
            case "B":
                System.out.println("A City name beginning with B is: Bristol");
                break;
            case "C":
                System.out.println("A City name beginning with C is: Cardiff");
                break;
            case "D":
                System.out.println("A City name beginning with D is: Durham");
                break;
            case "E":
                System.out.println("A City name beginning with E is: Edinburgh");
                break;
            case "F":
                System.out.println("A City name beginning with F is: Frankfurt");
                break;
            default:
                System.out.println("Invalid entry!");
                scanner.close();


        }
    }
}
