// Exercise 04: Created an Interface named Drawable and then implementing it in child subclasses...

// Define the interface
interface Drawable {
    void draw();
}

// Implement the interface in Circle class
class Circle03 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Implement the interface in Rectangle class
class Rectangle03 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

// Implement the interface in Triangle class
class Triangle03 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}

// Main class to test the implementation
public class DrawableImplementation {
    public static void main(String[] args) {
        Drawable circle = new Circle03();
        Drawable rectangle = new Rectangle03();
        Drawable triangle = new Triangle03();

        // Call draw() method for each shape
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}

