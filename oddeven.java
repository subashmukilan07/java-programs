import java.util.Scanner;

class oddeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        System.out.println("Multiplication Table:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + (i * num));
        }

        sc.close();
    }
}