package Lab_6.Task1;

public class Task1 {
public static void main(String[] args) {
    Person ta = new Person("Рижа Мавпа", 74);
    ta.introduce();
}
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Привіт, мене звати " + name + ", мені " + age + " роки.");
    }
}
