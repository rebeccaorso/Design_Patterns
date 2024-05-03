package strategyPattern;

public class ShoppingCart {
    private TaxStrategy taxStrategy;

    public ShoppingCart(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculateTotalWithTax(double amount) {
        double tax = taxStrategy.calculateTax(amount);
        return amount + tax;
    }
}
