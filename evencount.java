public class evencount {
    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 25, 30};
        int even = 0;

        for (int i = 0; i < arr.length; i++) {
          int num = arr[i];
          if (num % 2 == 0) {
                even++;
          }
        }

        System.out.println("Even Count = " + even);
    }
}