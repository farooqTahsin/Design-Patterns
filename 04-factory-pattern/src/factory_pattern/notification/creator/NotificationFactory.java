package factory_pattern.notification.creator;

import factory_pattern.notification.product.EmailNotification;
import factory_pattern.notification.product.Notification;
import factory_pattern.notification.product.PushNotification;
import factory_pattern.notification.product.SMSNotification;

public class NotificationFactory {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}
