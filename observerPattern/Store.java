package observerPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
    private Map<String, List<EventListener>> listeners = new HashMap<>();

    public void subscribe(String eventType, EventListener listener) {
        if (!listeners.containsKey(eventType)) {
            listeners.put(eventType, new ArrayList<>());
        }
        listeners.get(eventType).add(listener);
    }

    public void notify(String eventType, String message) {
        if (listeners.containsKey(eventType)) {
            for (EventListener listener : listeners.get(eventType)) {
                listener.update(eventType, message);

            }
        }
    }

    public void newItemArrival(String item) {
        notify("NEW_ITEM", "New item available: " + item);
    }

    public void startSale(String item) {
        notify("SALE", "Sale on " + item);
    }
}
