package facadePattern;

//Gestisce l'invio di notifiche agli utenti, come le email di conferma dopo una transazione.
public class NotificationService {
    public void sendConfirmationEmail(User user, Transaction transaction){
        System.out.println("Confirmation email sent to " + user.getEmail());
    }
}
