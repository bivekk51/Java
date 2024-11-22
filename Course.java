// Create a class named "Course" with data members title, credit, and courseCode. 
// A method named "setValues" to assign values and another method named "showValues" to display the record. 
// In main, instantiate 5 objects of course in an array and display the record of the course whose title starts with "C".

class Course {
    private String title;
    private int credit;
    private String courseCode;

    // Method to set values for the course
    public void setValues(String title, int credit, String courseCode) {
        this.title = title;
        this.credit = credit;
        this.courseCode = courseCode;
    }

    // Method to display the course values
    public void showValues() {
        System.out.println("Course Title: " + title);
        System.out.println("Credits: " + credit);
        System.out.println("Course Code: " + courseCode);
        System.out.println();
    }

    // Getter for the title to check if it starts with "C"
    public String getTitle() {
        return title;
    }
}

public class CourseDemo {
    public static void main(String[] args) {
        // Create an array of Course objects
        Course[] courses = new Course[5];
        
        // Instantiate each course object and set values
        courses[0] = new Course();
        courses[0].setValues("Computer Science", 4, "CS101");
        
        courses[1] = new Course();
        courses[1].setValues("Mathematics", 3, "MATH101");
        
        courses[2] = new Course();
        courses[2].setValues("Chemistry", 3, "CHEM101");
        
        courses[3] = new Course();
        courses[3].setValues("Physics", 4, "PHYS101");
        
        courses[4] = new Course();
        courses[4].setValues("Civics", 2, "CIVICS101");

        // Loop through the array and display courses whose title starts with "C"
        System.out.println("Courses whose title starts with 'C':");
        for (Course course : courses) {
            if (course.getTitle().startsWith("C")) {
                course.showValues();
            }
        }
    }
}
