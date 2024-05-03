package strategyPattern;

public class USTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.07;
    }
}
