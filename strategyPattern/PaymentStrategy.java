package strategyPattern;

//Ruolo e Responsabilità: Fornisce un'interfaccia comune per tutti i metodi di pagamento. Questa interfaccia definisce
// metodi come collectPaymentDetails(), validatePaymentDetails(), e pay(int paymentAmount), che ogni strategia concreta deve implementare.
public interface PaymentStrategy {
    void collectPaymentDetails();
    boolean validatePaymentDetails();
    void pay(int paymentAmount);
}
