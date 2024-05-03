package templateMethod;

public abstract class BaseGameLoader {
    //Questa classe fornisce la "template method" loadGame() che chiama una serie di metodi astratti
    // che devono essere implementati dalle sottoclassi. Questa classe gestisce la sequenza delle operazioni
    // e assicura che ogni passaggio venga eseguito nell'ordine corretto.
    public final void loadGame() {
        loadLocalData();
        createObjects();
        downloadAdditionalFiles();
        cleanTempFiles();
        initializeProfiles();
}
    protected abstract void loadLocalData();
    protected abstract void createObjects();
    protected abstract void downloadAdditionalFiles();
    protected abstract void cleanTempFiles();
    protected abstract void initializeProfiles();
}