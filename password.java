import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "admin123";
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (password.equals(correctPassword)) {
                System.out.println("Login Successfull");
                return;
            } else {
                attempts++;
            }
        }

        System.out.println("Account Locked");
    }
}