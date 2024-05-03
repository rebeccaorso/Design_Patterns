package strategyPattern;

public class PaymentByPayPal implements PaymentStrategy {
    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        this.email = "utente@example.com";
        this.password = "password";
        System.out.println("PayPal details collected");
    }

    @Override
    public boolean validatePaymentDetails() {
        return true;
    }

    @Override
    public void pay(int paymentAmount) {
        if (validatePaymentDetails()) {
            System.out.println("Payment of " + paymentAmount + " made with PayPal");
        } else {
            System.out.println("PayPal details are invalid.");
        }
    }
}
