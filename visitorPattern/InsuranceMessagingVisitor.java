package visitorPattern;

//Implementa specifici comportamenti per diversi tipi di clienti.
//Definisce come inviare messaggi specifici ai vari tipi di clienti (ad esempio, inviare promozioni di assicurazione medicale ai clienti residenziali).
public class InsuranceMessagingVisitor  implements Visitor {
    @Override
    public void visit(ResidentialClient residential) {
        System.out.println("Sending medical insurance ad to residential client.");
    }

    @Override
    public void visit(BusinessClient business) {
        System.out.println("Sending theft insurance mail to business client.");
    }
}
