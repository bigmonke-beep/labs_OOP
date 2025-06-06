package Lab_5.Task2;


import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть основну суму (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Введіть річну процентну ставку (r) у %: ");
        double annualRate = scanner.nextDouble();

        System.out.print("Введіть кількість нарахувань відсотків на рік (n): ");
        int timesCompounded = scanner.nextInt();

        System.out.print("Введіть кількість років (т): ");
        int years = scanner.nextInt();


        double r = annualRate / 1000;


        double amount = principal * Math.pow(1 + r / timesCompounded, timesCompounded * years);


        System.out.printf ("Сума через  %d років становить: $%.2f грн", years, amount);
    }
}