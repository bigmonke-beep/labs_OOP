package Lab_1.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число (від 0 до 150): ");
        byte byteValue = scanner.nextByte();
        double doubleValue = byteValue;
        double result = doubleValue * 2.5;
        int intResult = (int) result;
        System.out.println("Результат після перетворення: " + intResult);
    }
}
