package compositePattern;

public class VideoGame implements Component{
    private double price;

    public VideoGame(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
