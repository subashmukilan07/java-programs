import java.util.ArrayList;

public class al {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Anu");
        names.add("Ravi");
        names.add("Kumar");

        System.out.println(names);

        System.out.println(names.get(1));

        names.set(1, "Arun");

        names.remove("Anu");

        System.out.println(names);
    }
}