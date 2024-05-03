package visitorPattern;

//Definisce un'interfaccia per operazioni che possono essere applicate a elementi visitabili.
//Specificare i metodi visit per ogni tipo di Visitable.
public interface Visitor {
    void visit(ResidentialClient residential);
    void visit(BusinessClient business);
}
