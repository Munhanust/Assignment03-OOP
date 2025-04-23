package oopesp;

public class EmailNotification implements Notifiable {
    private String emailAddress;

    public EmailNotification(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void notifyUser(String message) {
        // Simulate sending an email
        System.out.println("Sending EMAIL to " + emailAddress + ": " + message);
    }
}