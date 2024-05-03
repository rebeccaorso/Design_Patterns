package prototypePattern;

public interface Prototype {
    //Definisce l'interfaccia per clonare se stessa. Questa interfaccia contiene tipicamente
    // un solo metodo clone() che è utilizzato per creare una copia dell'oggetto.
    Prototype clone();
}
