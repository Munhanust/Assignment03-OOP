package oopesp;
public class PanicButton {
    private EmergencyAlert alertSystem;

    public PanicButton(EmergencyAlert alertSystem) {
        this.alertSystem = alertSystem;
    }

    public void press() {
        alertSystem.triggerAlert("Patient pressed panic button!");
    }
}