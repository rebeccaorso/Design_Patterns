package prototypePattern;

public class Main {
    public static void main(String[] args) {
        // Creazione del registro degli oggetti
        ObjectRegistry registry = new ObjectRegistry();

        // Creazione dei prototipi degli oggetti
        GameObject playerPrototype = new GameObject("Player", 0, 0);
        GameObject enemyPrototype = new GameObject("Enemy", 100, 100);

        // Aggiunta dei prototipi al registro
        registry.addPrototype("Player", playerPrototype);
        registry.addPrototype("Enemy", enemyPrototype);

        // Clonazione e utilizzo dei prototipi
        GameObject player1 = (GameObject) registry.getPrototype("Player");
        player1.setPositionX(10);
        player1.setPositionY(20);
        System.out.println("Player 1: " + player1.getName() + " (" + player1.getPositionX() + ", " + player1.getPositionY() + ")");

        GameObject player2 = (GameObject) registry.getPrototype("Player");
        player2.setPositionX(30);
        player2.setPositionY(40);
        System.out.println("Player 2: " + player2.getName() + " (" + player2.getPositionX() + ", " + player2.getPositionY() + ")");
    }
}
