package oopesp;

public class NotificationService {
    private Notifiable notifier;

    public NotificationService(Notifiable notifier) {
        this.notifier = notifier;
    }

    public void sendAlert(String message) {
        notifier.notifyUser(message);
    }
}