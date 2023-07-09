import java.util.Arrays;
public class Aq35 {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        PlusOne solution = new PlusOne();
        int[] result = solution.plusOne(digits);
        System.out.println("Output: " + Arrays.toString(result));
    }
}

class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        digits[n - 1] += 1;
        for (int i = n - 1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1] += 1;
            } else {
                break; 
            }
        }
        if (digits[0] == 10) {
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
        }

        return digits;
    }
}