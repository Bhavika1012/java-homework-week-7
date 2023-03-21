package javaprogrammes;

/*
18. Write a Java program to sum values of an array.
 */
public class Programme_18_Array_Sum {
    public static void main(String[] args) {
        int[] numbers = {7, 5, 3, 1, 2}; //Defining integer arrays
        int sum = 0; //creating variable to store the sum

        for (int a = 0; a <numbers.length; a++){ //add each number to the sum variable
            sum += numbers[a];
        }

        System.out.println("The sum of the arrays is: "+ sum);
    }
}
