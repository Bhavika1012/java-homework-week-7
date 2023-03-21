package javaprogrammes;

import java.util.Scanner;

/*
13. Write a Java program which input any number between 1 to 7 and it print The Days  name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.  NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme_13_Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Create scanner object to take user input
        System.out.println("Enter a number from 1 - 7: ");
        int input = scanner.nextInt();

        switch (input){ //using switch statement to print days of the week
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Week contains 1 to 7 days"); //Out of selection message
                scanner.close();
        }
    }
}
