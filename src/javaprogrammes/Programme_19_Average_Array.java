package javaprogrammes;
/*
19. Write a Java program to calculate the average value of array elements.
 */
public class Programme_19_Average_Array {
    public static void main(String[] args) {
        int [] numbers = {1, 2 ,3 ,4 ,5 ,6 }; //Creating an array of integers

        int sum = 0;
        double average = 0.0; //Setting values for variables

        for (int a = 0; a < numbers.length; a++) { //using loop to add to the sum variable
            sum += numbers[a];
        }
        if (numbers.length > 0){
            average = (double) sum / (numbers.length); //Calculating the average by dividing the sum by the number length
        }

        System.out.println("The average value of the arrays is: "+ average);
    }
}
