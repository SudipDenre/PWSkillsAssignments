import java.util.Arrays;

public class Aq43 {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Aq43 solution = new Aq43();
        int[][] result = solution.transpose(matrix);

        System.out.println("Output: " + Arrays.deepToString(result));
    }
}

