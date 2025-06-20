package Lab_9.Task3;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(),
                new Triangle(),
                new Square(),
                new Shape(),
                new Circle(),
                new Triangle(),
                new Square()
        };

        for (Shape shape : shapes ) {
            shape.draw();

        }
    }
}
