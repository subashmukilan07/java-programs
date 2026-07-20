import java.util.Scanner;
class vowel
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter");
        String ch = sc.next();
        switch(ch)
        {
            case "A":
            case "a":
                {
                    System.out.println("A ia an vowel");
                    break;
                }
            case "E":
            case "e":
                {
                    System.out.println("E is an vowel");
                    break;
                }
            case "I":
            case "i":
                {
                    System.out.println("I is an vowel");
                    break;
                }
                case "O":
                case "o":
                {
                    System.out.println("O is an vowel");
                    break;
                }
                case "U":
                case "u":
                {
                    System.out.println("U is an vowel");
                    break;
                }
                default:
                {
                    System.out.println("Not an vowel");
                }
        }
    }
}