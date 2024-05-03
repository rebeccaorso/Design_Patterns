package mementoPattern;

public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();


        editor.addText("Lorem ipsum dolor sit amet, ");
        editor.save();


        editor.addText("consectetur adipiscing elit.");
        editor.save();


        System.out.println("Testo corrente:");
        System.out.println(editor.getText());


        editor.restore();
        System.out.println("\nTesto dopo il ripristino:");
        System.out.println(editor.getText());
    }
}
