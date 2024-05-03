package strategyPattern;
//Questa classe utilizza un oggetto PaymentStrategy per delegare l'azione di pagamento alla strategia concreta configurata.
public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder(int paymentAmount){
        paymentStrategy.collectPaymentDetails();
        paymentStrategy.pay(paymentAmount);
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
}
