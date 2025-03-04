// Exercise 03: Created a shape named Parent class and then inherited it in child classes to calculate area and perimeter of that shapes...

class Shape03 {
    double area() {
        return 0;  // Default implementation (to be overridden)
    }

    double perimeter() {
        return 0;  // Default implementation (to be overridden)
    }
}

class Circle02 extends Shape03 {
    private double radius;

    public Circle02(double radius) {

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

class Rectangle02 extends Shape03 {
    private double length, width;

    public Rectangle02(double length, double width) {
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

class Triangle02 extends Shape03 {
    private double a, b, c;

    public Triangle02(double a, double b, double c) {
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
    public static void main(String[] args) {
        Shape03 circle = new Circle02(5);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        Shape03 rectangle = new Rectangle02(4, 6);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        Shape03 triangle = new Triangle02(5,6,7);
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
    }
}


