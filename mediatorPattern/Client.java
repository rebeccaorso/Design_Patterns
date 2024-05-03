package mediatorPattern;

public class Client {

    //Crea un'istanza del mediatore (AuthenticationDialog) e interagisce con gli elementi dell'interfaccia utente (Button e TextField).
    public static void main(String[] args) {
        AuthenticationDialog dialog = new AuthenticationDialog();

        dialog.usernameField.setText("admin");
        dialog.passwordField.setText("admin");
        dialog.loginButton.click();  // Simulates user clicking the login button
    }
}