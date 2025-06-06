package Lab_5.Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        String[] question = {
                "Що з цього алкоголь?",
                "Скільки днів у лютому?",
                "Скільки буде 2+2?"
        };
        String[][] answers = {
                {"1. Beer ", "2. Juice ", "3. Coffee"},
                {"1. 69", "2. 31", "3. 28"},
                {"1. 5!", "2. 4!", "3. 9!"}
        };
        int[] trueAnswers = {1, 3, 2};

        Scanner scanner = new Scanner(System.in);

        int sumAnswers = 0;

        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i]);
            for (String answer : answers[i]) {
                System.out.println(answer);
            }
            System.out.print("Введіть номер вірної відповіді: ");
            int ans = 0;
            boolean cheak = false;
            while (!cheak) {
                if (scanner.hasNextInt()) {
                    ans = scanner.nextInt();
                    if (ans >= 1 && ans <= 3) {
                        cheak = true;
                    } else {
                        System.out.println("Невірний вибір. Виберіть число від 1 до 3.");
                    }
                } else {
                    System.out.print("Введіть число: ");
                    scanner.next();
                }
            }

            if (ans == trueAnswers[i]) {
                System.out.println("Правильна відповідь!!!");
                sumAnswers++;
            } else {
                System.out.println("Неправильна відповідь!!!");
            }
        }

        System.out.println("Ваша кількість правильних відповідей: " + sumAnswers + " з " + question.length);

        scanner.close();
    }
}
