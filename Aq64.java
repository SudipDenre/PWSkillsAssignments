import java.util.HashMap;
import java.util.Map;

public class Aq64 {
    public static void main(String[] args) {
        int[] nums = {0,1};
        int result = findMaxLength(nums);
        System.out.println(result);
    }
    public static int findMaxLength(int[] nums) {
        int maxLength = 0;
        int count = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1);      
        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] == 1) ? 1 : -1;
            if (countMap.containsKey(count)) {
                int prevIndex = countMap.get(count);
                int subarrayLength = i - prevIndex;
                maxLength = Math.max(maxLength, subarrayLength);
            } else {
                countMap.put(count, i);
            }
        }       
        return maxLength;
    }
}
