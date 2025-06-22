import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics", 999.99, 15),
            new Product(102, "Running Shoes", "Footwear", 79.99, 8),
            new Product(103, "Smartphone", "Electronics", 699.99, 22),
            new Product(104, "Smart Watch", "Accessories", 199.99, 3),
            new Product(105, "Headphones", "Electronics", 149.99, 0),
            new Product(106, "Yoga Mat", "Fitness", 29.99, 12),
            new Product(107, "Water Bottle", "Accessories", 19.99, 30)
        };
        System.out.println("=== Full Product Inventory ===");
        Arrays.stream(products).forEach(System.out::println);
        // Linear Search Examples
        System.out.println("\n=== Linear Search Examples ===");
        demoLinearSearch(products);
        // Binary Search Examples
        System.out.println("\n=== Binary Search Examples ===");
        demoBinarySearch(products);
    }
    private static void demoLinearSearch(Product[] products) {
        // Name search
        Product phone = LinearSearch.searchByName(products, "Smartphone");
        System.out.println("Search for 'Smartphone': " + 
                         (phone != null ? phone : "Not found"));
        // Category filter
        Product[] electronics = LinearSearch.searchByCategory(products, "Electronics");
        System.out.println("\nElectronics Products:");
        Arrays.stream(electronics).forEach(System.out::println);
        // Low stock alert
        Product[] lowStock = LinearSearch.searchLowStock(products, 5);
        System.out.println("\nLow Stock Items (≤5):");
        Arrays.stream(lowStock).forEach(System.out::println);
    }

    private static void demoBinarySearch(Product[] products) {
        BinarySearch.sortProductsByName(products);
        // Name search
        Product shoes = BinarySearch.searchByName(products, "Running Shoes");
        System.out.println("Search for 'Running Shoes': " + 
                         (shoes != null ? shoes : "Not found"));
        // Price range search
        Product[] midRange = BinarySearch.searchByPriceRange(products, 100, 200);
        System.out.println("\nProducts between $100-$200:");
        Arrays.stream(midRange).forEach(System.out::println);
    }
}