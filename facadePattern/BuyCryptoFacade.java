package facadePattern;


//Fornisce un'interfaccia semplice per l'acquisto di criptovalute, incapsulando le interazioni con i vari sottosistemi come gestione dell'account, esecuzione delle transazioni e notifiche.
public class BuyCryptoFacade {
    private AccountService accountService;
    private CryptoService cryptoService;
    private NotificationService notificationService;

    public BuyCryptoFacade(AccountService accountService, CryptoService cryptoService, NotificationService notificationService) {
        this.accountService = accountService;
        this.cryptoService = cryptoService;
        this.notificationService = notificationService;
    }

    public void
    buyCrypto(String userId, double amount, String currency) {
        User user = accountService.getUserDetails(userId);
        if (accountService.checkBalance(user, amount)) {
            Transaction transaction = cryptoService.performTransaction(user, amount, currency);
            notificationService.sendConfirmationEmail(user, transaction);
        } else {
            System.out.println("Not enough balance.");
        }
    }
}
