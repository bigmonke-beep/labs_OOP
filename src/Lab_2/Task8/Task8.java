package Lab_2.Task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть електрону пошту: ");
        String email = sc.nextLine();
        int atIndex = email.indexOf("@");
        if (atIndex == -1) {
            System.out.println("Ви ввели не електрону пошту. Спробуйте ще раз.");
        } else {

            String username = email.substring(0, atIndex);
            String domain = email.substring(atIndex + 1);
            System.out.println("Інформація про користувача: " + "username - " + username + ", поштовий сервіс - " + domain);
        }
        sc.close();
    }
}
