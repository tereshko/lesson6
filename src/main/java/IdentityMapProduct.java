import java.util.HashMap;
import java.util.Map;

public class IdentityMapProduct {
    private static Map<String, Product> productMap = new HashMap<>();

    public static void addProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    public static Product getProduct(String id) {
        return productMap.get(id);
    }
}
