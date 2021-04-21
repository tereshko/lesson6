import java.util.HashMap;
import java.util.Map;

public class IdentityMapOrder {
    private static Map<String, Order> orderMap = new HashMap<>();

    public static void addOrder(Order order) {
        orderMap.put(order.getOrderId(), order);
    }

    public static Order  getOrder(String id) {
        return orderMap.get(id);
    }
}
