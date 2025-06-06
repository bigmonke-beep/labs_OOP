package Lab_7.Task4;

public class Task4 {
    private String username;
    private String password;

    public Task4(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String enteredPassword) {
        return this.password.equals(enteredPassword);
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Пароль змінено успішно.");
        } else {
            System.out.println("Неправильний старий пароль.");
        }
    }

    public static void main(String[] args) {
        Task4 user = new Task4("BillyBob", "8642");
        System.out.println("Вхід: " + user.login("75698"));
        user.changePassword("8642", "newPass");
        System.out.println("Вхід з новим паролем: " + user.login("newPass"));
    }
}