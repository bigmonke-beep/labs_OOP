package Lab_6.Task4;

public class Task4 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.increment();
        c2.increment();
        System.out.println("Counter c1: " + c1.getCount());
        System.out.println("Counter c2: " + c2.getCount());

        StaticCounter.increment();
        StaticCounter.increment();
        System.out.println("StaticCounter: " + StaticCounter.getCount());
    }
}

class Counter {
    private int count = 0;

    void increment() {
        count++;
    }

    int getCount() {
        return count;
    }
}

class StaticCounter {
    private static int count = 0;

    static void increment() {
        count++;
    }

    static int getCount() {
        return count;
    }
}
