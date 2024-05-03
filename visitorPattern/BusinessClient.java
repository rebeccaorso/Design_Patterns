package visitorPattern;

public class BusinessClient implements Visitable {
    private String name;

    public BusinessClient(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
