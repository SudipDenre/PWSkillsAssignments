public class Aq4 {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        Solution solution = new Solution();
        int[] result = solution.plusOne(digits);

        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
        System.out.print(result[i]);
        if (i != result.length - 1) {
            System.out.print(", ");
        }
        }
        System.out.println("]");
    }
}
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
