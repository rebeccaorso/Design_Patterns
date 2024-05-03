package mediatorPattern;

public class AuthenticationDialog implements DialogMediator {
    //Implementa DialogMediator e gestisce la logica di interazione tra i componenti di UI. È il mediatore che decide cosa fare quando viene cliccato il pulsante o modificati i campi di testo.

    public Button loginButton;
    public TextField usernameField;
    public TextField passwordField;

    public AuthenticationDialog() {
        this.loginButton = new Button(this);
        this.usernameField = new TextField(this);
        this.passwordField = new TextField(this);
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender.equals(loginButton) && event.equals("click")) {
            if (usernameField.getText().equals("admin") && passwordField.getText().equals("admin")) {
                System.out.println("Authentication successful.");
            } else {
                System.out.println("Authentication failed.");
            }
        }
    }
}