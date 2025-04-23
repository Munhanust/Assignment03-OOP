package oopesp;
public class ChatClient {
    private String userName;
    private ChatServer server;

    public ChatClient(String userName, ChatServer server) {
        this.userName = userName;
        this.server = server;
    }

    public void sendMessage(String to, String message) {
        server.sendMessage(userName, to, message);
    }

    public void showHistory() {
        for (String msg : server.getHistory()) {
            System.out.println(msg);
        }
    }
}