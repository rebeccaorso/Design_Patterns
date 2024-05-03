package mementoPattern;

public class Client {
    public static void main(String[] args) {
        TextArea textArea = new TextArea();
        Caretaker caretaker = new Caretaker();

        textArea.setText("Hello");
        caretaker.save(textArea);
        System.out.println("Current Text: " + textArea.getText());

        textArea.setText("Hello, World!");
        caretaker.save(textArea);
        System.out.println("Updated Text: " + textArea.getText());

        caretaker.undo(textArea);
        System.out.println("After Undo: " + textArea.getText());

        caretaker.undo(textArea);
        System.out.println("After Second Undo: " + textArea.getText());
    }
}
