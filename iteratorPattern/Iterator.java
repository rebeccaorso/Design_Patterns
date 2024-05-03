package iteratorPattern;

//Definisce l'interfaccia base per gli iteratori. Questa interfaccia stabilisce i metodi che tutti
// gli iteratori concreti devono implementare per navigare attraverso una collezione, in questo caso, i vertici di un grafo.
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
