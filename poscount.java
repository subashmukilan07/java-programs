public class poscount {
    public static void main(String[] args) {

        int[] arr = {0, 10, -15, 20, -25, -30};
        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
          int num = arr[i];
          if (num > 0) {
                pos++;
          }
        }

        System.out.println("Positive Count = " + pos);
    }
}