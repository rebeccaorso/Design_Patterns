package visitorPattern;

//Rappresentano specifici tipi di clienti che possono essere visitati.
//Ogni classe ha il compito di implementare il metodo accept che passa se stessa al Visitor, consentendo al visitor di eseguire l'operazione appropriata.
public class ResidentialClient implements Visitable {
    private String name;

    public ResidentialClient(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
