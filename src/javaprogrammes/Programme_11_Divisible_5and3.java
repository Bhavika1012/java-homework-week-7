package javaprogrammes;
/*
11.  Write a java program to print the numbers between 1 to 100 which can be divided by 3  and 5 separately.
 */
public class Programme_11_Divisible_5and3 {
    public static void main(String[] args) {
        System.out.println("Numbers up-to 100 that are divisible by 3: ");
        for (int a = 1; a <= 100; a++) { //Using loop to check if each number is divisible by 3
            if (a % 3 == 0) {
                System.out.println(a + " ");
            }
        }

        System.out.println("Numbers up-to 100 that are divisible by 5: ");
        for (int b = 1; b <= 100; b++) { //Using loop to check if each number is divisible by 5
            if (b % 5 == 0) {
                System.out.println(b + " ");
            }
        }
    }
}
