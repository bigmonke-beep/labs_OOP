package Lab_5.Task7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static String[] elements = {"🍒", "🍋", "🍊", "🏆", "⚓"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int balance = 10;
        int stavka;
        int win;
        String game;


        System.out.println("Хай, ти попав на гру 'Слот-машина'!!!");
        System.out.println("В грі може бути такі символи:" + Arrays.toString(elements));

        do {

            System.out.println("Поточний баланс: " + balance);

            System.out.print("Яку ставку зробимо?: ");
            stavka = scanner.nextInt();
            scanner.nextLine();

            if (stavka <= 0 || balance < stavka) {
                System.out.println("Введено невірну ставку!!!");
            } else {

                balance -= stavka;

                String[] result = spinRow();

                printRow(result);

                win = getPayout(result, stavka);

                balance += win;
                if (win > 0) {
                    System.out.println("Ви вийграли " + win);
                } else {
                    System.out.println("Ви програли " + stavka);
                }
                System.out.println("Ваш баланс після:" + balance);
            }

            if (balance == 0) {
                System.out.println("Ваш рахунок 0 !!!");
                break;
            }

            System.out.println("Ви хочете грати ще (yes/no)?");
            game = scanner.nextLine();
        } while (game.equals("yes") && balance > 0);

        System.out.println("Гра завершена!!!");
        scanner.close();
    }

    static String[] spinRow() {
        Random random = new Random();
        String[] randomElements = new String[3];

        for (int i = 0; i < 3; i++) {
            randomElements[i] = elements[random.nextInt(elements.length - 1)];
        }

        return randomElements;
    }

    static void printRow(String[] row) {

        System.out.println("*************************");

        for (int i = 0; i < row.length; i++) {
            System.out.print(row[i]);
            if (i != row.length - 1) {
                System.out.print(" | ");
            }
        }

        System.out.println();
        System.out.println("*************************");
    }

    static int getPayout(String[] row, int bet) {

        boolean isMatch = true;
        for (int i = 0; i < row.length - 1; i++) {
            if (!row[i].equals(row[i + 1])) {
                isMatch = false;
                break;
            }
        }

        if (isMatch) {
            switch (row[0]) {
                case "🍒":
                    return bet * 3;
                case "🍋":
                    return bet * 4;
                case "🍊":
                    return bet * 5;
                case "🏆":
                    return bet * 10;
                case "⚓":
                    return bet * 100;
                default:
                    return 0;
            }
        }

        boolean isMatch2 = false;
        for (int i = 0; i < row.length - 1; i++) {
            for (int j = i + 1; j < row.length; j++) {
                if (row[i].equals(row[j])) {
                    isMatch2 = true;
                    break;
                }
            }
        }

        if (isMatch2) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍋" -> bet * 3;
                case "🍊" -> bet * 4;
                case "🏆" -> bet * 5;
                case "⚓" -> bet * 6;
                default -> 0;
            };
        }

        return 0;
    }

}
