// Write a java program to find the second largest element in an array

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestElement {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40, 50};

        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println("The second largest element is: " + numbers[1]);
    }
}
