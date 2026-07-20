import java.util.Scanner;

public class mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student Name: ");
        String name = sc.nextLine();

        System.out.print("Mark 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Mark 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Mark 3: ");
        int mark3 = sc.nextInt();

        System.out.print("Mark 3: ");
        int mark4 = sc.nextInt();

        System.out.print("Mark 3: ");
        int mark5 = sc.nextInt();

        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        double average = total / 5.0;

        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nStudent Mark Details:");
        System.out.println("Name    : " + name);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade   : " + grade);

        if (average >= 40) {
            System.out.println("Result  : PASS");
        } else {
            System.out.println("Result  : FAIL");
        }

        sc.close();
    }
}