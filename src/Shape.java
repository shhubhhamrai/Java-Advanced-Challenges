// Exercise-02 : Shape class representing different shapes
public class Shape {
    protected String name;
    protected String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing a " + color + " " + name);
    }

    @Override
    public String toString() { // Overriding Object class method tosString()
        return "Shape: " + name + ", Color: " + color;
    }
    public static void main(String[] args) {
        Shape redCircle = new Shape("Circle", "Red");
        Shape blueRectangle = new Shape("Rectangle", "Blue");
        Shape greenTriangle = new Shape("Triangle", "Green");

        redCircle.draw();
        blueRectangle.draw();
        greenTriangle.draw();

        System.out.println(redCircle);
        System.out.println(blueRectangle);
        System.out.println(greenTriangle);
    }
}

