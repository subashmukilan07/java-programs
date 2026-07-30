import java.util.HashMap;

public class ProductInventory {
    public static void main(String[] args) {

        HashMap<String, Integer> products = new HashMap<>();

        products.put("Rice", 50);
        products.put("Milk", 30);
        products.put("Bread", 20);

        System.out.println("Products: " + products);

        System.out.println("Rice Available: " + products.containsKey("Rice"));

        products.put("Milk", 25);

        System.out.println("After Selling Milk: " + products);

        products.remove("Bread");

        System.out.println("After Removing Bread: " + products);

        System.out.println("Available Products:");

        for (String product : products.keySet()) {
            System.out.println(product + " - Stock: " + products.get(product));
        }
    }
}