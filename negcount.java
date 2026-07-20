public class negcount {
    public static void main(String[] args) {

        int[] arr = {0, 10, -15, 20, -25, -30};
        int neg = 0;

        for (int i = 0; i < arr.length; i++) {
          int num = arr[i];
          if (num < 0) {
                neg++;
          }
        }

        System.out.println("Negative Count = " + neg);
    }
}