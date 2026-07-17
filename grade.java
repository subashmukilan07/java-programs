import java.util.Scanner;
class grade
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark");
        int mark = sc.nextInt();
        if(mark >= 90)
        {
            System.out.println("Grade A");
        }
        else if(mark >= 80)
        {
           System.out.println("Grade B");
        }
        else if(mark >= 60)
        {
            System.out.println("Grade C");
        }
        else if(mark >= 40)
        {
             System.out.println("Grade D");
        }
        else
        {
             System.out.println("FAIL");
        }

    }
}