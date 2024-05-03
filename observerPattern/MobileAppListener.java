package observerPattern;

public class MobileAppListener implements  EventListener {
    private String username;

    public MobileAppListener(String username) {
        this.username = username;
    }

    @Override
    public void update(String eventType, String message) {
        System.out.println("Push notification to " + username + ": " + message);
    }
}


