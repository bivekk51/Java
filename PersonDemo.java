// Write a program to create a class named "Person" with the number field "age". 
// Throw an exception if the user enters a negative number for the age.

import java.util.Scanner;

class Person {
    private int age;

    // Constructor to set age
    public Person(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.age = age;
    }

    // Method to display age
    public void displayAge() {
        System.out.println("Age: " + age);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            Person person = new Person(age);
            person.displayAge();
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
