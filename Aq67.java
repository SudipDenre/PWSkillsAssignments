import java.util.Arrays;

public class Aq67 {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = generateMatrix(n);
        
        // Print the matrix
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;
        int num = 1;
        
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Fill the top row
            for (int col = colStart; col <= colEnd; col++) {
                matrix[rowStart][col] = num++;
            }
            rowStart++;
            
            // Fill the rightmost column
            for (int row = rowStart; row <= rowEnd; row++) {
                matrix[row][colEnd] = num++;
            }
            colEnd--;
            
            // Fill the bottom row
            if (rowStart <= rowEnd) {
                for (int col = colEnd; col >= colStart; col--) {
                    matrix[rowEnd][col] = num++;
                }
                rowEnd--;
            }
            
            // Fill the leftmost column
            if (colStart <= colEnd) {
                for (int row = rowEnd; row >= rowStart; row--) {
                    matrix[row][colStart] = num++;
                }
                colStart++;
            }
        }
        
        return matrix;
    }
}
