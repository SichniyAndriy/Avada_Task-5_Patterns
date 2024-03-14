package structural.facade.model;

import java.math.BigDecimal;
import java.util.List;

public record Order(String id, List<Product> productList, BigDecimal price) {
}
