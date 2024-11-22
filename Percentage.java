// Create a class Student with private member variables name and percentage. Write methods to set, display, and 
// return values of private member variables in the Student class. Create 10 different objects of the Student class, 
// set the values, and display the name of the Student who has the highest average_marks in the main method of 
// another class named StudentDemo.

class Student {
    private String name;
    private double percentage;

    // Method to set the name and percentage
    public void setDetails(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    // Method to display the details of the student
    public void display() {
        System.out.println("Name: " + name + ", Percentage: " + percentage);
    }

    // Method to return the percentage of the student
    public double getPercentage() {
        return percentage;
    }

    // Method to return the name of the student
    public String getName() {
        return name;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Create 10 Student objects
        Student[] students = new Student[10];
        
        // Set details for each student
        students[0] = new Student();
        students[0].setDetails("Alice", 85.0);
        
        students[1] = new Student();
        students[1].setDetails("Bob", 90.5);
        
        students[2] = new Student();
        students[2].setDetails("Charlie", 75.2);
        
        students[3] = new Student();
        students[3].setDetails("David", 88.4);
        
        students[4] = new Student();
        students[4].setDetails("Eve", 92.3);
        
        students[5] = new Student();
        students[5].setDetails("Frank", 79.6);
        
        students[6] = new Student();
        students[6].setDetails("Grace", 85.7);
        
        students[7] = new Student();
        students[7].setDetails("Heidi", 91.8);
        
        students[8] = new Student();
        students[8].setDetails("Ivy", 84.2);
        
        students[9] = new Student();
        students[9].setDetails("Jack", 78.9);

        // Find the student with the highest percentage
        double highestPercentage = 0;
        String topStudent = "";
        
        for (int i = 0; i < students.length; i++) {
            if (students[i].getPercentage() > highestPercentage) {
                highestPercentage = students[i].getPercentage();
                topStudent = students[i].getName();
            }
        }

        // Display the name of the student with the highest percentage
        System.out.println("The student with the highest percentage is: " + topStudent);
    }
}
