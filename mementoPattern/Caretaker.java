package mementoPattern;

import java.util.Stack;

//Gestisce quando e come i mementi vengono creati e utilizzati. Non modifica o esamina il contenuto dei mementi,
// ma solo li conserva e li recupera quando richiesto.
public class Caretaker {
    private Stack<TextArea.TextMemento> history = new Stack<>();

    public void save(TextArea textArea) {
        history.push(textArea.save());
    }

    public void undo(TextArea textArea) {
        if (!history.isEmpty()) {
            TextArea.TextMemento memento = history.pop();
            textArea.restore(memento);
        }
    }
}
