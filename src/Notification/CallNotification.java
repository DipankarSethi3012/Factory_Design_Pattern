package Notification;

public class CallNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Sending information through Call");
    }
}
