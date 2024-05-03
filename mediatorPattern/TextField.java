package mediatorPattern;

public class TextField extends Component{
    private String text = "";
    public TextField(DialogMediator mediator) {
        super(mediator);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        super.change();
    }
}
