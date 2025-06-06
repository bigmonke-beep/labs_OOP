package Lab_4.Task10;

public class Task10 {
    public static void main(String[] args) {
        printNumbers("Ці числа:", 1,3,5,7,9);
    }

    public static void printNumbers(String message, int... numbers) {
        System.out.print(message + " ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
