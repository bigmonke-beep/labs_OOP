package Lab_5.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNumber;
        double secondNumber;
        String operachin;
        double result = 0;

        System.out.print("Введіть перше число: ");
        firstNumber = scanner.nextDouble();
        System.out.print("Введіть бажану операцію (+, -, *, /, ^): ");
        operachin = scanner.next();
        System.out.print("Введіть друге число: ");
        secondNumber = scanner.nextDouble();

        switch (operachin) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Ділити на 0 не можна!!!");
                } else {
                    result = firstNumber / secondNumber;
                }
                break;
            case "^":
                result = Math.pow(firstNumber , secondNumber);
                break;
            default:
                System.out.println("Введена невірна операція");
        }

        System.out.println("Результат: " + result);

        scanner.close();
    }
}
