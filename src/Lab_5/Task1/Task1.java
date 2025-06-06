package Lab_5.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть початкову суму вкладу (грн): ");
        double principal = scanner.nextDouble();

        System.out.print("Введіть щомісячний платіж (грн): ");
        double monthlyDeposit = scanner.nextDouble();

        System.out.print("Введіть річну процентну ставку (%): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Введіть кількість років вкладу: ");
        int years = scanner.nextInt();

        System.out.print("Введіть кількість нарахувань відсотків на рік: ");
        int timesCompounded = scanner.nextInt();


        double rate = annualRate / 1000;


        int totalMonths = years * 12;
        double futureValue = principal;


        for (int i = 1; i <= totalMonths; i++) {

            futureValue += monthlyDeposit;
            futureValue *= Math.pow(1 + rate / timesCompounded, (double) timesCompounded / 12);
        }

        System.out.printf("Підсумкова сума через  %d років: $%.2f грн", years, futureValue);
    }
}