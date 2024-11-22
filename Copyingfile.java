// Write a Java program to read data from the file "text.txt" and write the data into the file "best.txt"

import java.io.*;

public class FileCopyExample {
    public static void main(String[] args) {
        // Creating File objects for input and output files
        File inputFile = new File("text.txt");
        File outputFile = new File("best.txt");

        try (
            // Create FileReader and FileWriter to read from and write to the files
            FileReader fileReader = new FileReader(inputFile);
            FileWriter fileWriter = new FileWriter(outputFile)
        ) {
            int character;
            // Read the file character by character and write it to the output file
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }

            System.out.println("Data has been copied from text.txt to best.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
