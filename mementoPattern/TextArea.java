package mementoPattern;

// Gestisce il testo e può generare un memento del suo stato corrente o ripristinarlo da un memento.
// Contiene anche una classe interna TextMemento che rappresenta il memento, incapsulando lo stato.
public class TextArea {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // Salvare lo stato interno
    public TextMemento save() {
        return new TextMemento(text);
    }

    // Ripristinare lo stato da un memento
    public void restore(TextMemento memento) {
        text = memento.getState();
    }

    // Classe Memento interna
    //Una classe interna privata nell'Originator che contiene lo stato da salvare. È accessibile solo dall'Originator,
    // garantendo che il suo stato non possa essere modificato direttamente da altre classi.
    public static class TextMemento {
        private final String state;

        private TextMemento(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }
    }
}
