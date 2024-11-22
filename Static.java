// Java program to illustrate the concept of static method

class Calculator {

    // Static method to perform addition of two numbers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Static method to perform subtraction of two numbers
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {
        // Calling the static methods using the class name without creating an object
        int sum = Calculator.add(10, 20);
        int difference = Calculator.subtract(20, 10);

        // Display the results
        System.out.println("Sum of 10 and 20: " + sum);
        System.out.println("Difference of 20 and 10: " + difference);
    }
}
