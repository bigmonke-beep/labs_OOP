package Lab_2.Task7;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введіть мінімальне значення: ");
        int min = sc.nextInt();
        System.out.print("Введіть максимальне значення: ");
        int max = sc.nextInt();
        if (min > max) {
            System.out.println("Мінімальне значення не може бути більше за максимальне.");
        } else {

            int num = rand.nextInt(max - min + 1) + min;
            System.out.println("Згенероване число: " + num);
            String parity = (num % 2 == 0) ? "парним" : "непарним";
            System.out.printf("Число %d є %s.\n", num, parity);
            sc.close();
        }
    }
}
