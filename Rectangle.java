// Create an interface "Shape" with a method void Myshape(String name). 
// Create two classes "Rectangle" and "Circle" to implement this method. 
// Then instantiate objects for each class to call the Myshape(String) function.

interface Shape {
    void Myshape(String name);
}

class Rectangle implements Shape {
    public void Myshape(String name) {
        System.out.println("This is a Rectangle named: " + name);
    }
}

class Circle implements Shape {
    public void Myshape(String name) {
        System.out.println("This is a Circle named: " + name);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        // Create objects of Rectangle and Circle
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        // Call the Myshape method for both shapes
        rectangle.Myshape("Rectangle1");
        circle.Myshape("Circle1");
    }
}
