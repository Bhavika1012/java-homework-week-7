package javaprogrammes;

/*
20. Write a Java program to test if an array contains a specific value.
 */
public class Programme_20_Specific_Value {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 11}; //creating array of numbers
        int specificValue = 4; //Defining the specific value

        boolean containsValue = false; //variable to see whether values contain the specific value
        for (int a = 0; a < numbers.length; a++) { //loop to check through every value to see if it matches
            if (numbers[a] == specificValue) {
                containsValue = true;
            }
        }
        if (containsValue) {
            System.out.println("The array contains the value " + specificValue);
        } else {
            System.out.println(" The array does not contain the value " + specificValue);
        }
    }
}
