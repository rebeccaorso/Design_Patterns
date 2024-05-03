package compositePattern;

import java.util.ArrayList;
import java.util.List;

//COMPOSITE CLASS
//Rappresenta un contenitore che può includere sia prodotti che altre scatole. Gestisce una collezione di Component oggetti. Il metodo getPrice() calcola il prezzo totale dei suoi sottocomponenti più il costo del packaging.
public class Box implements Component {
    private List<Component> children = new ArrayList<>();
    private double packagingCost;

    public Box(double packagingCost) {
        this.packagingCost = packagingCost;
    }


    public void addComponent(Component component) {
        children.add(component);
    }

    @Override
    public double getPrice() {
        double total = packagingCost;
        for (Component child : children) {
            total += child.getPrice();
        }
        return total;
    }
}
