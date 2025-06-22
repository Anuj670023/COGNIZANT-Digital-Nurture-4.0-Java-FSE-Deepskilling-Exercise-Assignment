import java.util.Arrays;
import java.util.Objects;
public class LinearSearch {

    // Searches for a product by name (case-insensitive)
    public static Product searchByName(Product[] products, String targetName) {
        Objects.requireNonNull(products, "Product array cannot be null");
        Objects.requireNonNull(targetName, "Target name cannot be null");
        
        for (Product product : products) {
            if (product != null && targetName.equalsIgnoreCase(product.getProductName())) {
                return product;
            }
        }
        return null;
    }

    // Filters products by category (case-insensitive)
    public static Product[] searchByCategory(Product[] products, String category) {
        Objects.requireNonNull(products, "Product array cannot be null");
        Objects.requireNonNull(category, "Category cannot be null");
        
        return Arrays.stream(products)
                .parallel()
                .filter(Objects::nonNull)
                .filter(p -> category.equalsIgnoreCase(p.getCategory()))
                .toArray(Product[]::new);
    }

    // Finds products with stock at or below threshold
    public static Product[] searchLowStock(Product[] products, int threshold) {
        Objects.requireNonNull(products, "Product array cannot be null");
        return Arrays.stream(products)
                .parallel()
                .filter(Objects::nonNull)
                .filter(p -> p.getStock() <= threshold)
                .toArray(Product[]::new);
    }
}