package flyweightPattern;

// Questa classe rappresenta lo stato intrinseco condiviso (flyweight). Lo stato intrinseco è immutabile e comune tra molte istanze di Book.
public class BookType {
    private final String type;
    private final String distributor;

    private final String otherData;

    public BookType(String type, String distributor, String otherData) {
        this.type = type;
        this.distributor = distributor;
        this.otherData = otherData;
    }

    public String getType() {
        return type;
    }

    public String getDistributor() {
        return distributor;
    }

    public String getOtherData() {
        return otherData;
    }
}
