import java.util.Arrays;
import java.util.Comparator;

public class EcommerceSearch {

    static class Product {
        int id;
        String name;
        String type;

        Product(int id, String name, String type) {
            this.id = id;
            this.name = name;
            this.type = type;
        }

        public String toString() {
            return id + " - " + name + " (" + type + ")";
        }
    }

    public static Product linearSearch(Product[] list, String name) {
        for (Product p : list) {
            if (p.name.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] list, String name) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int check = list[mid].name.compareToIgnoreCase(name);

            if (check == 0) {
                return list[mid];
            } else if (check < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] items = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "Shoes", "Fashion"),
            new Product(4, "Watch", "Fashion"),
            new Product(5, "Bag", "Accessories")
        };

        Product[] sortedItems = Arrays.copyOf(items, items.length);
        Arrays.sort(sortedItems, Comparator.comparing(p -> p.name.toLowerCase()));

        String nameToSearch = "Shoes";

        Product result1 = linearSearch(items, nameToSearch);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not found"));

        Product result2 = binarySearch(sortedItems, nameToSearch);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not found"));
    }
}
