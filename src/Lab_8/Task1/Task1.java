package Lab_8.Task1;

public class Task1 {
    private String name;
    private int age;

    public Task1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Employee extends Task1 {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Іван", 18, 26000);
        System.out.println("Ім'я: " + emp.getName());
        System.out.println("Вік: " + emp.getAge());
        System.out.println("Зарплата: " + emp.getSalary());
    }
}
