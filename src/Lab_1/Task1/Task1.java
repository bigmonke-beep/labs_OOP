package Lab_1.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ваш вік :");
        int age = scanner.nextInt();
        System.out.println("Ваш вік :" + age);
        scanner.close();
    }
}
