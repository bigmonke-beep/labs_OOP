package Lab_2.Task1;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int a = sc.nextInt();

        if (a == 0) {
            System.out.println("Число є 0 ");
        } else if (a > 0) {
            System.out.println("Число є додатнім ");
        } else {
            System.out.println("Число є від'ємним");
        }
        sc.close();
    }
}
