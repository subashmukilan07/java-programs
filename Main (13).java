import java.util.*;

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> books = new ArrayList<>(Arrays.asList("Java", "Python", "C"));
        LinkedList<String> issued = new LinkedList<>();

        System.out.print("Issue book: ");
        String b = sc.nextLine();
        if (books.remove(b)) {
            issued.add(b);
            System.out.println("Book Issued");
        }

        System.out.print("Return book: ");
        b = sc.nextLine();
        if (issued.remove(b)) {
            books.add(b);
            System.out.println("Book Returned");
        }

        System.out.print("Search book: ");
        b = sc.nextLine();
        System.out.println(books.contains(b) ? "Book Available" : "Book Not Available");

        sc.close();
    }
}