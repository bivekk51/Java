import java.io.*;
import java.util.Scanner;

public class PrimeCompositeString {

    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Get the length of the string
        int length = inputString.length();

        // Method to check if the length is prime
        boolean isPrime = true;
        if (length <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(length); i++) {
                if (length % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Create the file writer to write data into the files
        try {
            if (isPrime) {
                // If the length is prime, write to "Prime.txt"
                FileWriter primeWriter = new FileWriter("Prime.txt");
                primeWriter.write(inputString);
                primeWriter.close();
                System.out.println("String written to Prime.txt as its length is a prime number.");
            } else {
                // If the length is not prime, write to "Composite.txt"
                FileWriter compositeWriter = new FileWriter("Composite.txt");
                compositeWriter.write(inputString);
                compositeWriter.close();
                System.out.println("String written to Composite.txt as its length is not a prime number.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
