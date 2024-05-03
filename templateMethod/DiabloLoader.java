package templateMethod;

public class DiabloLoader extends BaseGameLoader{

   //
    @Override
    protected void loadLocalData() {
        System.out.println("Loading Diablo data...");
    }

    @Override
    protected void createObjects() {
        System.out.println("Creating game objects for Diablo...");
    }

    @Override
    protected void downloadAdditionalFiles() {
        System.out.println("Downloading additional files for Diablo...");
    }

    @Override
    protected void cleanTempFiles() {
        System.out.println("Cleaning temporary files...");
    }

    @Override
    protected void initializeProfiles() {
        System.out.println("Initializing player profiles for Diablo...");
    }
}
