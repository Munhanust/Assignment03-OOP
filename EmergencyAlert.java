package oopesp;

public class EmergencyAlert {
    private double heartRateThreshold;
    private double bpThreshold;
    private NotificationService notificationService;

    public EmergencyAlert(double heartRateThreshold, double bpThreshold,
                          NotificationService notificationService) {
        this.heartRateThreshold = heartRateThreshold;
        this.bpThreshold = bpThreshold;
        this.notificationService = notificationService;
    }

    public void checkVitals(double heartRate, double bloodPressure) throws VitalSignException {
        if (heartRate > heartRateThreshold) {
            throw new VitalSignException("Heart rate " + heartRate + " exceeds threshold");
        }
        if (bloodPressure > bpThreshold) {
            throw new VitalSignException("Blood pressure " + bloodPressure + " exceeds threshold");
        }
    }

    public void triggerAlert(String message) {
        notificationService.sendAlert("EMERGENCY: " + message);
    }
}