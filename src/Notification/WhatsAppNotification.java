package Notification;

public class WhatsAppNotification implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("Sending Information through What's App");
    }
}
