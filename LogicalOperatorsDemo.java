// Write a program to demonstrate the use of logical OR, AND, and NOT operator with suitable example

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        if (a < b && b < c) {
            System.out.println("Logical AND condition is true.");
        } else {
            System.out.println("Logical AND condition is false.");
        }

        if (a > b || b < c) {
            System.out.println("Logical OR condition is true.");
        } else {
            System.out.println("Logical OR condition is false.");
        }

        if (!(a > c)) {
            System.out.println("Logical NOT condition is true.");
        } else {
            System.out.println("Logical NOT condition is false.");
        }
    }
}
