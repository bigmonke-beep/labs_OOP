package Lab_6.Task5;

public class Task5 {
    public static void main(String[] args) {
        Book b1 = new Book("Стражі Поррядку", "Кен Бруен");
        Book b2 = new Book("Свинка Пеппа");

        b1.printInfo();
        b2.printInfo();
    }
}

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(String title) {
        this.title = title;
        this.author = "name";
    }

    void printInfo() {
        System.out.println("Книга: " + title + ", автор: " + author);
    }
}
