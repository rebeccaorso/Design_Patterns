package strategyPattern;

public class EUTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.20;
    }
}
