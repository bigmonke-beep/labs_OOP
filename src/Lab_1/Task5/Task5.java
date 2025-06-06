package Lab_1.Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ваше ім'я: ");
        String name = scanner.nextLine();
        System.out.print("Введіть ваш вік: ");
        int age = scanner.nextInt();
        System.out.print("Введіть ваш зріст у сантиметрах: ");
        double height = scanner.nextDouble();

        System.out.print("Ви студент? (так/ні): ");
        boolean isStudent = scanner.next().equalsIgnoreCase("так");

        System.out.println("\nОтримані дані:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " років");
        System.out.println("Height: " + height + " м");
        System.out.println("Student: " + isStudent);
    }
}
