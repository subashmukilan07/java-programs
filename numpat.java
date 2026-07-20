public class numpat {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {

                if (j % 2 != 0) { // Odd column
                    System.out.print((j * 5 - (5 - i)) + " ");
                } else { // Even column
                    System.out.print(((j - 1) * 5 + (6 - i)) + " ");
                }
            }
            System.out.println();
        }
    }
}