import java.util.Arrays;
public class seclargest {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int min = arr[0];

        Arrays.sort(arr);

        System.out.println("Second Largest = "+ arr[arr.length-2]);
    }
}