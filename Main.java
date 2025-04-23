package oopesp;

public class Main {
    public static void main(String[] args) {
        // Setup notification channels
        Notifiable email = new EmailNotification("doc@example.com");
        Notifiable sms = new SMSNotification("+1234567890");

        // Emergency module
        NotificationService emergencyNotifier = new NotificationService(email);
        EmergencyAlert emergencyAlert = new EmergencyAlert(100.0, 140.0, emergencyNotifier);
        PanicButton panicButton = new PanicButton(emergencyAlert);

        // Chat & Video module
        ChatServer chatServer = new ChatServer();
        ChatClient patientClient = new ChatClient("PatientA", chatServer);
        ChatClient doctorClient = new ChatClient("DoctorB", chatServer);
        VideoCall videoCall = new VideoCall("https://meet.example.com/abc123");

        // Reminders module
        NotificationService medReminder = new ReminderService(sms);

        try {
            // Simulate vitals
            emergencyAlert.checkVitals(110.0, 130.0);
        } catch (VitalSignException e) {
            emergencyAlert.triggerAlert(e.getMessage());
        }

        // Patient presses panic
        panicButton.press();

        // Chat
        patientClient.sendMessage("DoctorB", "Hello Doctor, I feel dizzy.");
        doctorClient.sendMessage("PatientA", "Please take rest and measure your BP.");
        patientClient.showHistory();

        // Video consultation
        videoCall.startCall();

        // Send reminders
        ((ReminderService) medReminder).sendReminder("Take blood pressure medicine", "08:00 AM");
    }
}
