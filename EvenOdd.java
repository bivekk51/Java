import java.util.Scanner;

public class EvenIndexOddSum {

    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Declare and initialize the array
        int[] array = new int[n];
        
        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Variable to store the sum of odd integers at even indices
        int oddSum = 0;
        
        // Check integers at even indices
        System.out.println("Checking integers at even indices:");
        for (int i = 0; i < n; i += 2) {
            if (array[i] % 2 != 0) { // If the number is odd
                System.out.println("Element at index " + i + " (" + array[i] + ") is odd.");
                oddSum += array[i]; // Add to sum
            }
        }
        
        // Display the sum of odd integers at even indices
        System.out.println("Sum of odd integers at even indices: " + oddSum);

        scanner.close();
    }
}
