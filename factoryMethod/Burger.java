package factoryMethod;

//Il primo passo nel Factory Method è definire un'interfaccia per il tipo di oggetto (prodotto)
// che si desidera creare. Questa interfaccia specifica i metodi che devono essere implementati
// da tutti i tipi concreti di prodotti che il factory method produrrà.
public interface Burger {

    void prepara();

    void cucina();

    void servi();
}
