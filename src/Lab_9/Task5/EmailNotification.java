package Lab_9.Task5;

public class EmailNotification extends Notification {

    @Override
    public void send(String message) {
        System.out.printf( "Sending email: <%s>", message);
    }
}
