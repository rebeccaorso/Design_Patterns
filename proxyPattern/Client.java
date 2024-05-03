package proxyPattern;

public class Client {
    public static void main(String[] args) {
        File file = new ProxyFile("document.txt", "user123");
        file.display(); // Output: Access denied. You do not have permission to view this file.

        File adminFile = new ProxyFile("document.txt", "admin");
        adminFile.display(); // Output: Loading file: document.txt Displaying file: document.txt
    }
}
