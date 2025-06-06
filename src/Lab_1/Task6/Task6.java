package Lab_1.Task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть довжину прямокутника: ");
        double length = scanner.nextDouble();

        System.out.print("Введіть ширину прямокутника: ");
        double width = scanner.nextDouble();

        double area = length * width;
        System.out.println("Площа прямокутника: " + area);
    }
}
