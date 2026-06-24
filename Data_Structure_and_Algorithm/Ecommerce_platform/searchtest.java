package Data_Structure_and_Algorithm.Ecommerce_platform;
import java.util.Arrays;
import java.util.Comparator;

public class searchtest {
    public static product linearSearch(product[] products, int id) {

        for (product product : products) {
            if (product.productId == id) {
                return product;
            }
        }

        return null;
    }

    public static product binarySearch(product[] products, int id) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (products[mid].productId == id) {
                return products[mid];
            }

            if (products[mid].productId < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        product[] products = {
                new product(103, "Keyboard", "Electronics"),
                new product(101, "Laptop", "Electronics"),
                new product(105, "Shoes", "Fashion"),
                new product(102, "Phone", "Electronics"),
                new product(104, "Watch", "Accessories")
        };

        product result1 = linearSearch(products, 104);

        System.out.println("Linear Search Result:");
        System.out.println(result1);

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        product result2 = binarySearch(products, 104);

        System.out.println("\nBinary Search Result:");
        System.out.println(result2);
    }
}

