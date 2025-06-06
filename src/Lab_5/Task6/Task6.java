package Lab_5.Task6;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] variant = {"rock", "paper", "scissors"};

        String player = "";
        int pc;

        System.out.println("Гра почалась!!!");
        String play = "yes";
        do {
            System.out.print("Оберіть rock, paper або scissors: ");

            boolean isProp = false;
            while (!isProp) {
                player = scanner.nextLine();
                for (String prop : variant) {
                    if (player.equalsIgnoreCase(prop)) {
                        isProp = true;
                        break;
                    }
                }
                if (!isProp) {
                    System.out.println("Обрано невірний запис!!!");
                    System.out.print("Оберіть rock, paper або scissors: ");
                }
            }

            String pcOut = variant[random.nextInt(0, 3)];
            System.out.println("Комп'ютер обрав: " + pcOut);

            short isPlayerWin = -1;
            if (player.equalsIgnoreCase(pcOut)) {
                isPlayerWin = 0;
            } else if (player.equalsIgnoreCase("rock")) {
                if (pcOut.equalsIgnoreCase("scissors")) {
                    isPlayerWin = 1;
                }
            } else if (player.equalsIgnoreCase("paper")) {
                if (pcOut.equalsIgnoreCase("rock")) {
                    isPlayerWin = 1;
                }
            } else {
                if (pcOut.equalsIgnoreCase("paper")) {
                    isPlayerWin = 1;
                }
            }

            if (isPlayerWin == 1) {
                System.out.println("Ви перемогли!!!");
            } else if (isPlayerWin == -1) {
                System.out.println("Ви програли!!!");
            } else {
                System.out.println("Нічия!!!");
            }

            System.out.println("Ви хочете грати ще (yes/no)?");
            play = scanner.nextLine();
        } while (play.equals("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
