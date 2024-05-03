package adapterPattern;

//Rappresenta un servizio di terze parti con una funzionalità specifica che accetta solo dati in formato JSON.
// La funzione render simula la visualizzazione di questi dati.
public class FancyUIService {
    public void render(String jsonData){
        System.out.println("Rendering data with Fancy UI: " + jsonData);
    }
}
