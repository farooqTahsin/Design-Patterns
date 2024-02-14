package factory_pattern.notification;

import factory_pattern.notification.creator.NotificationFactory;
import factory_pattern.notification.product.Notification;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
