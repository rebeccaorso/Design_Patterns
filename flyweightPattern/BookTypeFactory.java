package flyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class BookTypeFactory {
    private static final Map<String, BookType> bookTypes = new HashMap<>();

    public static BookType getBookType(String type, String distributor, String otherData) {
        // Utilizza computeIfAbsent per inserire un BookType solo se non esiste già uno per il tipo specificato
        return bookTypes.computeIfAbsent(type, k -> new BookType(type, distributor, otherData));
    }
}
