package oopesp;

public class ReminderService extends NotificationService {
    public ReminderService(Notifiable notifier) {
        super(notifier);
    }

    public void sendReminder(String message, String time) {
        sendAlert("REMINDER at " + time + ": " + message);
    }
}