package adapterPattern;

//imula un contesto d'uso dove l'IMultiRestoApp originale viene usato direttamente per mostrare dati XML,
// e poi viene usato l'adapter per adattare questi dati per il FancyUIService che richiede JSON.
// Questo mostra la flessibilità dell'adapter nel connettere sistemi altrimenti incompatibili senza modificare le classi esistenti.
public class Client {
    public static void main(String[] args){
        IMultiRestoApp app = new MultiRestoApp();
        app.displayData("<data>Hello XML</data>");

        FancyUIService fancyService = new FancyUIService();
        IMultiRestoApp appAdapter = new FancyUIServiceAdapter(fancyService);
        appAdapter.displayData("<data>Hello XML</data>");
    }
}
