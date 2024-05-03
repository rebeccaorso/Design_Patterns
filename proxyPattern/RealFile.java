package proxyPattern;

public class RealFile implements File {
    private String fileName;
    public RealFile(String fileName) {
        this.fileName = fileName;
        loadFromFileSystem();
    }
    private void loadFromFileSystem() {
        System.out.println("Loading file: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying file: " + fileName);
    }
}
