package Lab_4.Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ваше ім'я:");
        String name = scanner.nextLine();
        System.out.println("Введіть ваш вік:");
        int age = scanner.nextInt();
        printInfo(name);
        printInfo(name, age);
    }

    public static void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    public static void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
