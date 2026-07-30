import java.util.ArrayList;

public class ArrayListTask {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Arun");
        students.add("Kumar");
        students.add("Priya");
        students.add("Rahul");
        students.add("Divya");

        System.out.println("Student List: " + students);

        System.out.println("Student at index 2: " + students.get(2));

        students.set(3, "Anu");
        System.out.println("After updating index 3: " + students);

        students.remove(1);
        System.out.println("After removing one student: " + students);

        System.out.println("Total Students: " + students.size());

        if (students.contains("Kumar")) {
            System.out.println("Kumar is present.");
        } else {
            System.out.println("Kumar is not present.");
        }

        students.clear();

        System.out.println("Final List: " + students);
    }
}