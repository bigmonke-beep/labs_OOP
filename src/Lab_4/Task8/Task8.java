package Lab_4.Task8;

public class Task8 {
    static int counter = 0;

    public static void main(String[] args) {
        setCounter(9);
        System.out.println("Глобальний counter: " + counter);
    }

    public static void setCounter(int counter) {
        System.out.println("Локальний counter: " + counter);
    }
}
