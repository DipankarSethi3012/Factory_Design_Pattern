package Notification;

public class NotificationService {
    public static Notification sendNotificationMode(String mode) {
        Notification notification = NotificationFactory.getNotificationMode(mode);
        notification.sendNotification();
        return notification;
    }
}
