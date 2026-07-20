import java.util.Scanner;
class swap {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("First number:");
        int a = sc.nextInt();
        System.out.println("Second number:");
        int b = sc.nextInt(); 
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swappping:");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}