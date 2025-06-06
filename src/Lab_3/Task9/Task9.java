package Lab_3.Task9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int[] array = {82,11,30,69,47,23,10,29,82,99};

        System.out.print("Початковий масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть індекс(0-9): ");
        int index = scanner.nextInt();

        if (index < 0 || index >= 10) {
            System.out.println("Некоректний індекс!");
        } else {
            System.out.print("Введіть нове значення: ");
            int newValue = scanner.nextInt();

            array[index] = newValue;

            System.out.print("Оновлений масив: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
