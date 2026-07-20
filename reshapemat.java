public class reshapemat {
    public static void main(String[] args) {

        int[][] mat = {
            {1, 2},
            {3, 4}
        };

        int r = 1;
        int c = 4;

        int rows = mat.length;
        int cols = mat[0].length;

        if (rows * cols != r * c) {
            System.out.println("Reshape not possible.");
            return;
        }

        int[][] result = new int[r][c];

        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[index / c][index % c] = mat[i][j];
                index++;
            }
        }

        System.out.println("Reshaped Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}