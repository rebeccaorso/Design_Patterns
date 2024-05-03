package prototypePattern;

import java.util.HashMap;
import java.util.Map;

public class ObjectRegistry {
    private Map<String, Prototype> prototypes = new HashMap<>();


    public void addPrototype(String key, Prototype prototype) {
        prototypes.put(key, prototype);
    }


    public Prototype getPrototype(String key) {
        return prototypes.get(key).clone();
    }
}
