package strategyPattern;

//mplementazione concreta di PaymentStrategy per il pagamento tramite carta di credito.
public class PaymentByCreditCard implements PaymentStrategy {
    private String cardNumber;
    private String cardHolder;
    private String cardExpirationDate;
    private String cvv;

    @Override
    public void collectPaymentDetails() {
        this.cardNumber = "1234 5678 9101 1121";
        this.cardHolder = "Mario Rossi";
        this.cardExpirationDate = "12/25";
        this.cvv = "123";
        System.out.println("Card details collected");
    }

    @Override
    public boolean validatePaymentDetails() {
        return true;
    }

    @Override
    public void pay(int paymentAmount) {
        if (validatePaymentDetails()){
            System.out.println("Payment of " + paymentAmount + " made with credit card");
        }else{
            System.out.println("Credit card details are invalid.");
        }

    }
}
