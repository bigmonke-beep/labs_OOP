package Lab_2.Task6;

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число: ");
        double num = sc.nextDouble();

        System.out.println("Квадратний корінь: " + Math.sqrt(num));
        System.out.println("Округлення значення: " + Math.round(num));
        System.out.println("Піднесення до квадрату: " + Math.pow(num, 2 ));
        System.out.println("Синус числа: " + Math.sin(num));

        sc.close();
    }
}
