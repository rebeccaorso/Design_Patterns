package templateMethod;

public class WorldOfWarcraftLoader extends BaseGameLoader{

  //: Queste classi implementano i metodi astratti definiti in BaseGameLoader.
  // Ogni classe fornisce implementazioni specifiche per i passaggi richiesti nel processo di caricamento di ciascun gioco,
  // permettendo così di personalizzare il comportamento del caricamento per ogni gioco senza modificare la struttura del processo.
    @Override
    protected void loadLocalData() {
        System.out.println("Loading World of Warcraft data...");
    }

    @Override
    protected void createObjects() {
        System.out.println("Creating game objects for World of Warcraft...");
    }

    @Override
    protected void downloadAdditionalFiles() {
        System.out.println("Downloading additional files for World of Warcraft...");
    }

    @Override
    protected void cleanTempFiles() {
        System.out.println("Cleaning temporary files...");
    }

    @Override
    protected void initializeProfiles() {
        System.out.println("Initializing player profiles for World of Warcraft...");
    }
}
