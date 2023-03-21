package javaprogrammes;

import java.util.Scanner;

/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross  salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================| _
*/
public class Programme_5_Salary_Slip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Create a scanner object
        System.out.println("Enter Employee ID");
        int empId = scanner.nextInt(); //reading user input as integer

        System.out.println("Enter Employee Name");
        scanner.nextLine();
        String empName = scanner.nextLine(); //reading user input as string

        System.out.println("Enter basic salary");
        scanner.nextLine();
        double salary = scanner.nextDouble(); //reading user input as double

        //calculating the different salaries
        double hra = salary * 0.1;
        double ta = salary * 0.08;
        double da = salary * 0.09;
        double pf = salary * 0.2;
        double grossSalary = salary + hra + ta + da - pf; //calculate gross salary

        System.out.println("______________________________");
        System.out.println("| Salary Slip                |");
        System.out.println("|____________________________|");
        System.out.println("| Employee Id   : " + empId + "         |");
        System.out.println("| Employee Name : " + empName + "     |");
        System.out.println("|____________________________|");
        System.out.println("| Basic Salary : " + salary + "    |");
        System.out.println("| HRA 10%  : " + hra + "          |");
        System.out.println("| TA 8%    : " + ta + "           |");
        System.out.println("| DA 9%    : " + da + "           |");
        System.out.println("| PF - 20% : " + pf + "          |");
        System.out.println("|____________________________|");
        System.out.println("| Gross Salary : " + grossSalary + "   |");
        System.out.println("|============================|");

        scanner.close();

    }
}



