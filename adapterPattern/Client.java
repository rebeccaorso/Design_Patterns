package adapterPattern;

public class Client {
    public static void main(String[] args) {
        ExistingGraphicsLibrary oldLibrary = new ExistingGraphicsLibrary();
        NewGraphicsRenderer adapter = new ExistingGraphicsAdapter(oldLibrary);
        adapter.renderNewGraphics();
    }
}
