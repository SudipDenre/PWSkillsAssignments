import java.util.Arrays;
public class Aq28 {
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int minScore = minDifference(nums, k);
        System.out.println(minScore);

    }    
    public static int minDifference(int[] nums, int k) {
        int n = nums.length;
        if (n <= 4) {
            return 0;
        }
        Arrays.sort(nums);
        int minScore = Integer.MAX_VALUE;
        for (int i = 0; i <= 3; i++) {
            int maxIndex = n - 1 - (3 - i);
            int minIndex = i;
            int maxChange = nums[maxIndex] - k;
            int minChange = nums[minIndex] + k;
            int score = maxChange - minChange;
            minScore = Math.min(minScore, score);
        }
        return minScore;
    }

}
