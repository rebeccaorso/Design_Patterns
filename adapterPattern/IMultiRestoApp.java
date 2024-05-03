package adapterPattern;

//Definisce il contratto per le applicazioni che gestiscono la visualizzazione dei dati. Questo contratto
// impone il metodo displayData che accetta dati in formato stringa (XML in questo caso).
public interface IMultiRestoApp {
    void displayData(String xmlData);
}
