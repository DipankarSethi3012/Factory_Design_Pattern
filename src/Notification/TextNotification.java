package Notification;

public class TextNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Sending Information through Text: ");
    }
}
