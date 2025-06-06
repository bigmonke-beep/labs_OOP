package Lab_2.Task4;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть ім'я: ");
        String name = sc.nextLine();

        System.out.print("Введіть вік: ");
        int age = sc.nextInt();

        System.out.println("println: Ім'я: " + name + ", " + "Вік: " + age);
        System.out.printf("printf: Ім'я: %s, Вік: %d\n", name, age);
    }
}
