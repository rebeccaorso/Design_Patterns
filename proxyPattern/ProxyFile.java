package proxyPattern;

public class ProxyFile implements File {

    private RealFile realFile;
    private String fileName;
    private String user;
    public ProxyFile(String fileName, String user) {
        this.fileName = fileName;
        this.user = user;
    }

    @Override
    public void display() {
        if (user.equals("admin")) {
            realFile = new RealFile(fileName);
            realFile.display();
        } else {
            System.out.println("Access denied. You do not have permission to view this file.");
        }
    }
}
