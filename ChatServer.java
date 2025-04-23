package oopesp;

import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    private List<String> messageHistory = new ArrayList<>();

    public void sendMessage(String from, String to, String content) {
        String msg = from + " -> " + to + ": " + content;
        messageHistory.add(msg);
        System.out.println("[Chat] " + msg);
    }

    public List<String> getHistory() {
        return messageHistory;
    }
}
