package javaprogrammes;
/*
17. Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Programme_17_Arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 9, 6};
        Arrays.sort(numbers); //Sorting numbers using arrays.sort method
        System.out.println("Sorted numeric array" + Arrays.toString(numbers)); //sorted array

        String[] city = {"Aberdeen", "Cardiff", "Watford", "Luton", "Glasgow"};
        Arrays.sort(city); //Sorting strings using array.sort method
        System.out.println("Sorted string array: " +Arrays.toString(city));

    }
}
