import java.util.HashMap;
import java.util.Map;

public class BreadFactory {

    Map<String, Bread> breadMap = new HashMap<>();

    public BreadFactory() {
        breadMap.put("cream", new Cream("cream", 100, 100, 200));
        breadMap.put("sugar", new Sugar("sugar", 100, 50, 200));
        breadMap.put("butter", new Butter("butter", 100, 100, 50));
    }

    public Bread getBread(String breadType) {
        return breadMap.get(breadType);
    }
}
