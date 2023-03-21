package javaprogrammes;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C
 */
public class Programme_3__Student_Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Creating a scanner object to read input
        System.out.println("Enter student name: ");
        String name = scanner.nextLine(); //Storing input

        System.out.println("Enter student roll number: ");
        String rollNumber = scanner.nextLine();

        System.out.println("Enter marks for maths (out of 100):");
        int maths = scanner.nextInt();

        System.out.println("Enter marks for Science (out of 100): ");
        int science = scanner.nextInt();

        System.out.println("Enter marks for English (out of 100): ");
        int english = scanner.nextInt();

        //check for invalid marks
        if (maths < 0 || maths > 100 ||
                science < 0 || science > 100 ||
                english < 0 || english > 100) {
            System.out.println("Invalid input! Marks should be between 0 and 100.");
            return;
        }

        //calculating total result and percentage
        int totalMarks = maths + science + english;
        double percentage = (double) totalMarks / 3;

//calculating result and grade based on percentage
        String result, grade;
        if (percentage >= 35) {
            result = "Pass";
            if (percentage >= 80) {
                result = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else {
                grade = "c";
            }
        } else {
            result = "Fail";
            grade = "NA";
        }
        System.out.println("________________________________");
        System.out.println("|                               |");
        System.out.println("|          Mark Sheet           |");
        System.out.println("|_______________________________|");
        System.out.println("|   Name      :  "  +name + "            |");
        System.out.println("|   Roll No   : "   +rollNumber+"              |");
        System.out.println("|   Subjects  : Marks           |");
        System.out.println("|_______________________________|");
        System.out.println("|   Maths     :"   +maths + "               |");
        System.out.println("|   Science   :" +science + "               |");
        System.out.println("|   English   :" +english + "               |");
        System.out.println("|_______________________________|");
        System.out.println("|   Total     :" + totalMarks +"              |");
        System.out.println("|_______________________________|");
        System.out.println("|  Percentage :" + percentage +"         |");
        System.out.println("|  Result     :" + result +"             |");
        System.out.println("|_______________________________|");
        scanner.close();
    }
}
