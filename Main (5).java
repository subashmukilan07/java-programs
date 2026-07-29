import java.util.ArrayList;

public class al2 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Anu");
        names.add("Ravi");
        names.add("Kumar");

        System.out.println("After adding: " + names);

        System.out.println("Element at index 1: " + names.get(1));

        names.set(1, "Arun");
        System.out.println("After updating: " + names);

        names.remove("Anu");
        System.out.println("After removing: " + names);

        System.out.println("Number of elements: " + names.size());

        System.out.println("Contains Kumar: " + names.contains("Kumar"));

        names.clear();
        System.out.println("After clearing: " + names);
    }
}