import java.util.Arrays;

public class Aq51 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;
        int[][] result = convertTo2DArray(original, m, n);
        /*for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();*/
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < result.length; i++) {
                sb.append("[");
                for (int j = 0; j < result[i].length; j++) {
                    sb.append(result[i][j]);
                    if (j < result[i].length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("]");
                if (i < result.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
        
            System.out.println(sb.toString());

    }

    public static int[][] convertTo2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];  
        if (original.length != m * n) {
            return new int[0][0];
        }  
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int index = i * n + j;
                result[i][j] = original[index];
            }
        }
        return result;
    }
    
}
