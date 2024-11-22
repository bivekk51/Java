// Write a program to illustrate the concept of ArrayIndexOutOfBoundException

public class ArrayIndexOutOfBoundExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // Attempting to access an invalid index
            System.out.println("Accessing element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
