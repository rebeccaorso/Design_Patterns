package visitorPattern;

//Fornisce un contratto per le classi che possono essere visitate dai visitors.
//Definire il metodo accept che accetta un Visitor.
public interface Visitable {
    void accept(Visitor visitor);
}
