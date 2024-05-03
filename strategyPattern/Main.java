package strategyPattern;

public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart(new USTaxStrategy());
        double totalAmountForUS = shoppingCart.calculateTotalWithTax(100);
        System.out.println("Total amount for US: $" + totalAmountForUS);

        shoppingCart.setTaxStrategy(new EUTaxStrategy());
        double totalAmountForEU = shoppingCart.calculateTotalWithTax(100);
        System.out.println("Total amount for EU: €" + totalAmountForEU);

        shoppingCart.setTaxStrategy(new AsiaTaxStrategy());
        double totalAmountForAsia = shoppingCart.calculateTotalWithTax(100);
        System.out.println("Total amount for Asia: ¥" + totalAmountForAsia);
    }
}
