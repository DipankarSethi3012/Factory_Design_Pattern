package Notification;

public class NotificationFactory {
    public static Notification getNotificationMode(String mode) {

        if(mode.equalsIgnoreCase("textNotification")) {
            return new TextNotification();
        } else if(mode.equalsIgnoreCase("emailNotification")) {
            return new EmailNotification();
        } else if(mode.equalsIgnoreCase("callNotification")) {
            return new CallNotification();
        } else if(mode.equalsIgnoreCase("whatsAppNotification")) {
            return new WhatsAppNotification();
        }
        throw new IllegalArgumentException("Invalid mode of sending the notification");

    }
}
