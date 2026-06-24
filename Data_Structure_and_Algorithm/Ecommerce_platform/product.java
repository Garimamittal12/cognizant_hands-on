package Data_Structure_and_Algorithm.Ecommerce_platform;

public class product {

    int productId;
    String productName;
    String category;

    public product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return productId + " - " + productName + " - " + category;
    }
}
