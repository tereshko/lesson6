import java.util.List;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Order {
    private String orderId;
    private List<Product> productList;
    private Double price;
}
