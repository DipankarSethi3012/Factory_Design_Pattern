package Notification;

public class EmailNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Sending Information through Email: ");
    }
}
