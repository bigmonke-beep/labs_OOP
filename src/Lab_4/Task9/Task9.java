package Lab_4.Task9;

public class Task9 {
    public static void main(String[] args) {
        int result = sum(6,7,8,9,10);
        System.out.println("Сума: " + result);
    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
