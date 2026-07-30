import java.util.ArrayList;

public class Cart {
    public static void main(String[] args) {

        ArrayList<String> cart = new ArrayList<>();

        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        cart.add("Monitor");
        cart.add("Headphones");

        System.out.println("Shopping Cart: " + cart);

        System.out.println("Product at index 2: " + cart.get(2));

        cart.set(1, "Printer");
        System.out.println("After replacing index 1: " + cart);

        cart.remove(3);
        System.out.println("After removing one product: " + cart);

        System.out.println("Total products: " + cart.size());

        if (cart.contains("Laptop")) {
            System.out.println("Laptop is available in the cart.");
        } else {
            System.out.println("Laptop is not available in the cart.");
        }

        cart.clear();

        System.out.println("Final Cart: " + cart);
    }
}