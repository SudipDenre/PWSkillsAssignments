public class new2 {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        Rectangle rectangle = new Rectangle(5, 3);
        calculator.printArea(rectangle);  // Output: Area: 15.0

        Circle circle = new Circle(2.5);
        calculator.printArea(circle);  // Output: Area: 19.634954084936208

        Triangle triangle = new Triangle(4, 6);
        calculator.printArea(triangle);  // Output: Area: 12.0
    }
}
abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class ShapeCalculator {
    public void printArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("Area: " + area);
    }
}



