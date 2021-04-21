import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor

public class Product {
    private String id;
    private String name;
    private Double price;
    private String measuring;
}
