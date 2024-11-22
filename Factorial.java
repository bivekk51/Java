// Write a java program to find the factorial of any positive integer given by user using recursion

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.println("Factorial of " + number + " is: " + factorial(number));
        } else {
            System.out.println("Please enter a positive integer.");
        }

        scanner.close();
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
