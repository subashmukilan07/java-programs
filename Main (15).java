import java.util.HashMap;

public class hash {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Anu");
        students.put(102, "Rahul");
        students.put(103, "Priya");

        System.out.println(students);

        System.out.println(students.get(102));

        students.put(102, "Karthik");

        System.out.println(students);

        students.remove(101);

        System.out.println(students);

        System.out.println(students.containsKey(103));

        System.out.println(students.containsValue("Anu"));

        System.out.println(students.size());
    }
}