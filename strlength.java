import java.util.Scanner;

public class strlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        int count = 0;

        for (char c : ch) {
            count++;
        }

        System.out.println("Length of the string = " + count);

        sc.close();
    }
}