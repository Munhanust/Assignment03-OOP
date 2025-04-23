package oopesp;
public class SMSNotification implements Notifiable {
    private String phoneNumber;

    public SMSNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notifyUser(String message) {
        // Simulate sending an SMS
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}