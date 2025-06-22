import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
public class BinarySearch {

    // Sorts products by name (case-insensitive)
    public static void sortProductsByName(Product[] products) {
        Objects.requireNonNull(products, "Product array cannot be null");
        Arrays.sort(products, Comparator.comparing(Product::getProductName, 
                String.CASE_INSENSITIVE_ORDER));
    }

    // Binary search by product name
    public static Product searchByName(Product[] products, String targetName) {
        Objects.requireNonNull(products, "Product array cannot be null");
        Objects.requireNonNull(targetName, "Target name cannot be null");
        
        int low = 0;
        int high = products.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = products[mid].getProductName()
                               .compareToIgnoreCase(targetName);
            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    // Finds products within price range
    public static Product[] searchByPriceRange(Product[] products, 
                                             double minPrice, double maxPrice) {
        Objects.requireNonNull(products, "Product array cannot be null");
        return Arrays.stream(products)
                .parallel()
                .filter(Objects::nonNull)
                .filter(p -> p.getPrice() >= minPrice && p.getPrice() <= maxPrice)
                .toArray(Product[]::new);
    }
}