package facadePattern;

public class Transaction {

    private User user;
    private double amount;
    private String currency;

    public Transaction(User user, double amount, String currency) {
        this.user = user;
        this.amount = amount;
        this.currency = currency;
    }
}
