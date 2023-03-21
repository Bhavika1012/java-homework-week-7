package javaprogrammes;

import java.util.Scanner;

/*
7. Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */
public class Programme_7_Sales_Commission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sales ID: ");
        int salesId = scanner.nextInt();

        System.out.println("Enter sellers name");
        String sellerName = scanner.next();

        System.out.println("Enter sales amount");
        double salesAmount = scanner.nextDouble(); //use double for decimal

        System.out.println("Enter salary basic");
        double salaryBasic = scanner.nextDouble();

        //calculating commission based on salaries.
        double commission = 0;
        if (salesAmount >= 50000) {
            commission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 0.05;
        } else{
        commission = salesAmount * 0.02;
    }

        double salesCommission = salesAmount * commission;
        System.out.println("The commission earned by " + sellerName +" is " + salesCommission);
scanner.close();
}
}
