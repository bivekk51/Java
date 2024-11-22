// Write a program by using generic method to swap the positions of two different elements in an array

public class GenericSwapDemo {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C", "D"};

        System.out.println("Before Swap (Integer Array): " + java.util.Arrays.toString(intArray));
        swap(intArray, 1, 3);
        System.out.println("After Swap (Integer Array): " + java.util.Arrays.toString(intArray));

        System.out.println("Before Swap (String Array): " + java.util.Arrays.toString(strArray));
        swap(strArray, 0, 2);
        System.out.println("After Swap (String Array): " + java.util.Arrays.toString(strArray));
    }

    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
