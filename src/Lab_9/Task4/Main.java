package Lab_9.Task4;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(17),
                new Circle(6),
                new Rectangle(20, 99.9),
                new Rectangle(74.5, 40),
                new Shape()
        };

        for (Shape shape: shapes) {
            System.out.println("Обчислена площа = " + shape.area());
        }

    }
}

