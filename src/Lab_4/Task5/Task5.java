package Lab_4.Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть радіус кола:");
        double radius = scanner.nextDouble();
        System.out.println("Введіть довжину прямокутника:");
        double length = scanner.nextDouble();
        System.out.println("Введіть ширину прямокутника:");
        double width = scanner.nextDouble();

        double areaCircle = calculateArea(radius);
        double areaRectangle = calculateArea(length, width);

        System.out.println("Площа кола: " + areaCircle);
        System.out.println("Площа прямокутника: " + areaRectangle);
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius; // Площа кола
    }

    public static double calculateArea(double length, double width) {
        return length * width; // Площа прямокутника
    }
}
