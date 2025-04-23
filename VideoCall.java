package oopesp;

public class VideoCall {
    private String meetLink;

    public VideoCall(String meetLink) {
        this.meetLink = meetLink;
    }

    public void startCall() {
        System.out.println("Opening video call: " + meetLink);
        // In real app, open browser or embed link
    }
}