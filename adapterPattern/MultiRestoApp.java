package adapterPattern;

//Implementa l'interfaccia IMultiRestoApp, gestendo la visualizzazione dei dati. In un esempio reale,
// qui si potrebbe includere la logica per la manipolazione o l'elaborazione di dati XML prima di mostrarli.
public class MultiRestoApp implements  IMultiRestoApp {
    @Override
    public void displayData(String xmlData) {
        System.out.println("Displaying data: " + xmlData);
    }
}
