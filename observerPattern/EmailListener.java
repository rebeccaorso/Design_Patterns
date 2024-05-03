package observerPattern;

public class EmailListener implements EventListener{
    private String email;

    public EmailListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, String message) {

    }


}
