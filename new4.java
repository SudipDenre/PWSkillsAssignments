public class new4 {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        circle.draw();  // Output: Drawing a circle

        Drawable rectangle = new Rectangle();
        rectangle.draw();  // Output: Drawing a rectangle
    }
}
interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
        // Add drawing logic specific to Circle
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
        // Add drawing logic specific to Rectangle
    }
}


