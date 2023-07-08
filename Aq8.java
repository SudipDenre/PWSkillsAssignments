import java.util.Arrays;

public class Aq8 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] errorNums = findErrorNums(nums);
        System.out.println(Arrays.toString(errorNums));

    }
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;
        int[] count = new int[n + 1];
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                result[0] = i;
                break;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                result[1] = i;
                break;
            }
        }
        return result;
    }
    
}
