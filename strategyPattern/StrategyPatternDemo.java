package strategyPattern;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentService service = new PaymentService(new PaymentByCreditCard());
        service.processOrder(100);

        service.setPaymentStrategy(new PaymentByPayPal());
        service.processOrder(150);
    }
}
// Il PaymentService riceve un'istanza di PaymentStrategy dal client, che determina il metodo di pagamento.
// Quando viene richiesto di processare un ordine, PaymentService delega il processo di raccolta dei dettagli,
// validazione e pagamento all'oggetto PaymentStrategy specificato.

//Il Strategy è un pattern di progettazione comportamentale che definisce una famiglia di algoritmi
// e li incapsula in modo che possano essere scambiati l'uno con l'altro. Questo pattern consente di variare
// l'algoritmo indipendentemente dai clienti che lo utilizzano. Il vantaggio principale del pattern Strategy
// è che consente di cambiare l'algoritmo di un oggetto a runtime senza modificare l'oggetto stesso.
// Questo pattern è utile quando si hanno molteplici varianti di un algoritmo e si desidera alternare
// tra di loro durante l'esecuzione.