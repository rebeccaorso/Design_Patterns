package adapterPattern;

public class ExistingGraphicsAdapter implements NewGraphicsRenderer {
    private ExistingGraphicsLibrary library;

    public ExistingGraphicsAdapter(ExistingGraphicsLibrary oldLibrary) {
        this.library = oldLibrary; // Correggi il nome della variabile qui
    }

    @Override
    public void renderNewGraphics() {
        library.renderOldGraphics();
    }
}
