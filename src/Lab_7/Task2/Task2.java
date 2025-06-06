package Lab_7.Task2;

public class Task2 {
    private String title;
    private String author;
    private double price;

    public Task2 (String title, String author, double price) {
        this.title = title;
        this.author = author;
        setPrice(price);
    }

    // Гетери
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Сетери
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Ціна не може бути від’ємною. Встановлено 0 грн.");
            this.price = 0;
        }
    }

    // Метод для виведення інформації про книгу
    public void displayInfo() {
        System.out.println("Книга: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Ціна: " + price + " грн.");
    }

    // Головний метод для тестування
    public static void main(String[] args) {
        Task2 book = new Task2 ("Гмалет", "Уільям Шекспір", 500);
        book.displayInfo();

        book.setPrice(-50); // Спроба встановити від’ємну ціну
        book.displayInfo();
    }
}
