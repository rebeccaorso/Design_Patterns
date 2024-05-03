package abstractFactoryMethod;

public class Client {

    //Utilizzo: Il client utilizza solo interfacce dichiarate dall'Abstract Factory e dai prodotti che esso crea,
    // permettendo di cambiare famiglie
    // di prodotti facilmente cambiando la factory concreta usata.
    public static void main(String[] args) {
        ComputerFactory factory = new MsiFactory();  // MSI products
        GPU msiGpu = factory.createGPU();
        Monitor msiMonitor = factory.createMonitor();
        msiGpu.displayGPU();
        msiMonitor.displayMonitor();

        factory = new AsusFactory();  // ASUS products
        GPU asusGpu = factory.createGPU();
        Monitor asusMonitor = factory.createMonitor();
        asusGpu.displayGPU();
        asusMonitor.displayMonitor();
    }
}

//Questo pattern fornisce un'interfaccia per creare famiglie di oggetti correlati o dipendenti senza specificare
// le loro classi concrete. Il pattern Abstract Factory è un pattern di progettazione creazionale
// che fornisce un'interfaccia per creare famiglie di oggetti correlati o dipendenti senza specificare
// le loro classi concrete. Questo pattern è particolarmente utile quando un sistema deve essere indipendente
// da come i suoi prodotti vengono creati, composti e rappresentati.
//Interfaccia comune: L'Abstract Factory usa un'interfaccia comune per creare oggetti di famiglie correlate.
// Questo permette alle classi clienti di utilizzare prodotti generati senza modificare il codice cliente che usa l'interfaccia.
//Nascondi i dettagli di implementazione: L'Abstract Factory nasconde i dettagli di implementazione delle classi concrete
// e come vengono create e composte.
//Flessibilità: L'Abstract Factory offre una grande flessibilità in termini di design del software.
// Puoi cambiare la famiglia di prodotti che stai utilizzando semplicemente cambiando la factory concreta che stai utilizzando.