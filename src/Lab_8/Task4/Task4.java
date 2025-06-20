package Lab_8.Task4;

public class Task4 {
    public double area() {
        return 0.0;
    }
}

class Circle extends Task4 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Task4 {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(8, 3);
        System.out.println("Площа круга: " + circle.area());
        System.out.println("Площа прямокутника: " + rectangle.area());
    }
}
