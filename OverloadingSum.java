// Write a Java program to find the sum of two and three integers using concept of method overloading

public class MethodOverloadingSum {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum of two integers: " + calculator.sum(10, 20));
        System.out.println("Sum of three integers: " + calculator.sum(10, 20, 30));
    }
}

class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}
