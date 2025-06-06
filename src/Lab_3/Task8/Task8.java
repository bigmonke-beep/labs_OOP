package Lab_3.Task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введіть число, яке ви шукаєте: ");
        int userNum = scanner.nextInt();

        int[] array = {82,11,30,69,47,23,10,29,82,99};

        boolean found = false;
        for(int num:array) {
            if(num == userNum){
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число знайдено!");
        } else {
            System.out.println("Число не знайдено.");
        }

        scanner.close();
    }
}
