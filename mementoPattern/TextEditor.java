package mementoPattern;

import java.util.Stack;

public class TextEditor {
    private StringBuilder text = new StringBuilder();
    private Stack<EditorMemento> history = new Stack<>();


    public void addText(String addedText) {
        text.append(addedText);
    }


    public String getText() {
        return text.toString();
    }

    public void save() {
        history.push(new EditorMemento(text.toString()));
    }


    public void restore() {
        if (!history.isEmpty()) {
            EditorMemento memento = history.pop();
            text = new StringBuilder(memento.getText());
        }
    }
}
