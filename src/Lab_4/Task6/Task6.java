package Lab_4.Task6;

public class Task6 {
    public static void main(String[] args) {
        // Викликаємо метод printNumber() в main
        printNumber();

        // Спробуємо вивести змінну num у main()
        // Змінна num є локальною для методу printNumber()
        // Це означає, що вона існує лише всередині цього методу — поза ним.
        // У тому числі в main(), вона не існує, і Java не може її знайти.

        // Ось спроба вивести num:
        // System.out.println(num); // num не доступна в main
    }

    public static void printNumber() {
        // Локальна змінна num
        int num = 25;
        // Виведення значення змінної num
        System.out.println("Значення num: " + num);
    }
}
