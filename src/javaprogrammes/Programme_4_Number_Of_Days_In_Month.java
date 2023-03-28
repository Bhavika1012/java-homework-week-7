package javaprogrammes;
/*
4. Number of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,  otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400. Example of input/Output:
● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999) ● isLeapYear(1600);  should return true since 1600 is a leap year
● isLeapYear(2017);  should return false since 2017 is not a leap year
● isLeapYear(2000); should return true because 2000 is a leap year
Write another method getDaysInMonth with two parameter month and year. Both of type int.
If parameter month is < 1 or >12 return -1.
If parameter year is <1 or >9999 than return -1.
This method needs to return the number of days in the month. Be careful about leap years  they have 29 days in month 2 (February).
You should check if the year is a leap year using the method isLeapYear describe above.
Example of input/Output:
● getDaysInMonth(1, 2020); should return 31 since January has 31 days.
● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap   year.
● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and   2018 is not a leap year.
● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to   9999
HINT: Use the switch statement.
NOTE: Methods isLeapYear and getDaysInMonth need to be public static
 */

import java.util.Scanner;

public class Programme_4_Number_Of_Days_In_Month {
    public static void main(String[] args) {
        inputData();
        System.out.println(isLeapYear(year));
        System.out.println("Days in a month " + month + " is " + getDaysInMonth(month, year));
        //   isLeapYear(year);
    }

    static int year, month;
    //static boolean b, m;

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);  //scanner object
        System.out.println("Enter a month in MM format");
        month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Invalid Month!. Month should be in between 1 t0 12.");
        }

        System.out.println("Enter a year in YYYY format: ");
        year = scanner.nextInt(); // storing value in a variable

        if (year < 1 || year > 9999) {   // checks if the year is valid  b = false;
            System.out.println("Invalid year!, year should be >= 1 and <= 9999. Enter year again");
        }
        scanner.close();
    }

    //get days in month will take the month and year entered above

    public static int getDaysInMonth(int month, int yr) {
        int days = 0;
        String Month;
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if (isLeapYear(yr)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
        }
        return days;
    }

    public static boolean isLeapYear(int year) {
        boolean l;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) { //leap year logic part
            l = true;
        } else {
            l = false;
            // false condition
            //closing scanner
        }
        return l;
    }
}