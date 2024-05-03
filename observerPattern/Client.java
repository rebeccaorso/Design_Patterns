package observerPattern;

public class Client {
    public static void main(String[] args){
        Store store = new Store();

        store.subscribe("NEW_ITEM", new EmailListener("user@example.com"));
        store.subscribe("SALE", new MobileAppListener("user123"));

        store.newItemArrival("Cool New Gadget");
        store.startSale("Old Gadget");
    }
}
