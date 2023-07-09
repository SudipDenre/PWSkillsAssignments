import java.util.Arrays;

public class Aq53 {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] squaredSorted = sortedSquares(nums);
        System.out.println(Arrays.toString(squaredSorted));

    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int i = n - 1;
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                left++;
            } else {
                result[i] = rightSquare;
                right--;
            }
            i--;
        }
        return result;
    }

}
