package Lab_2.Task2;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int a = sc.nextInt();

        switch(a) {
            case 1 -> System.out.println("Понеділок");
            case 2 -> System.out.println("Вівторок");
            case 3 ->  System.out.println("Середа");
            case 4 -> System.out.println("Четвер");
            case 5 -> System.out.println("П'ятниця");
            case 6 -> System.out.println("Субота");
            case 7 -> System.out.println("Неділя");
            default -> System.out.println("Такого дня тижня немає");
        }
        sc.close();
    }
}
