import java.util.Scanner;

class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int i = 1;
        int fact = 1;
        while(i <= num)
        {
            fact *= i;
            i++;
        }
        System.out.println("Factorial:"+fact);
    }
}