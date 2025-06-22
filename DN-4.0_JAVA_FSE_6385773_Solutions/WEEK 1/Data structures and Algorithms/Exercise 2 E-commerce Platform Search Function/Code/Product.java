
// Represents a product in the e-commerce system
public class Product implements Comparable<Product> {
    private final int productId;
    private final String productName;
    private final String category;
    private double price;
    private int stock;

    public Product(int productId, String productName, String category, double price, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }
    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    @Override
    public int compareTo(Product other) {
        return this.productName.compareToIgnoreCase(other.productName);
    }
    @Override
    public String toString() {
        return String.format("ID: %d | %s | %s | $%.2f | Stock: %d",
               productId, productName, category, price, stock);
    }
}