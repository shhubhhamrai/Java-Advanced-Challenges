// Exercise 07: Created a differentShapes  abstract class which contains abstract methods to calculate area and perimeter
abstract class differentShapes {
    abstract double area();
    abstract double perimeter();
}

class Circle extends differentShapes {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends differentShapes {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends differentShapes {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double area() {
        double s = (a + b + c) / 2;  // Semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));  // Heron's formula
    }

    @Override
    double perimeter() {
        return a + b + c;
    }
}

public class Shape07 {
    public static void main(String[] args) {
        differentShapes circle = new Circle(5);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        differentShapes rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        differentShapes triangle = new Triangle(3,4,5);
        System.out.println("Triangle Area: "+triangle.area());
        System.out.println("Traingle Perimeter: "+triangle.perimeter());
    }
}

