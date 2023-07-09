import java.util.Arrays;

public class Aq44 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};

        Aq44 obj = new Aq44();
        int result = obj.arrayPairSum(nums);

        System.out.println("Output: " + result);
    }
}

