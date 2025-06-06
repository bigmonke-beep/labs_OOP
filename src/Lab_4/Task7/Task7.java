package Lab_4.Task7;

public class Task7 {
    static int counter = 0;

    public static void main(String[] args) {
        increment();
        increment();
        System.out.println("Counter: " + counter);
    }

    public static void increment() {
        counter++;
    }
}
