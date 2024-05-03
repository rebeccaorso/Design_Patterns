package builder;

public class BuilderDemo {

    //Il Client utilizza il builder per creare un oggetto. Il client si affida all'interfaccia fornita
    // dal builder per specificare i vari aspetti del prodotto che desidera costruire.
    // Dopo aver configurato il builder come necessario, il client può chiedere al builder di restituire l'oggetto finale,
    // generalmente chiamando un metodo come build().
    public static void main(String[] args) {
        CarBuilder builder = new ConcreteCarBuilder();
        Car car = builder.setBrand("Bugatti")
                .setModel("Chiron")
                .setColor("Blue")
                .setNumberOfDoors(2)
                .setCarScreenSpecs("12.3-inch digital cluster")
                .setWeight(1995.8)
                .setHeight(1.21)
                .setUniqueIdentifier("BUG123CHIRON")
                .build();
        System.out.println(car);
    }
}

//Questo pattern separa la costruzione di un oggetto complesso dalla sua rappresentazione,
// in modo che lo stesso processo di costruzione possa creare diverse rappresentazioni.
// È utile quando la costruzione di un oggetto richiede molti passaggi.
//Separazione delle responsabilità: Il Builder separa la responsabilità della costruzione dell'oggetto dalla classe stessa.
// Questo rende il codice più modulare e facile da leggere e scrivere.
//Costruzione passo-passo: Il Builder permette di costruire un oggetto passo dopo passo.
// Ogni passaggio è incapsulato nel suo metodo nel Builder.
//Creazione di diverse rappresentazioni: Utilizzando lo stesso processo di costruzione,
// il Builder può creare diverse rappresentazioni di un oggetto.