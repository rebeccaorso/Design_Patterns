package strategyPattern;

public class AsiaTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.15;
    }
}
