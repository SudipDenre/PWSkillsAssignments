import java.util.HashMap;
import java.util.Map;
public class Aq23 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int longestSubsequenceLength = findLHS(nums);
        System.out.println(longestSubsequenceLength);

    }
    
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int maxLength = 0;
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.containsKey(num + 1)) {
                int currentLength = frequencyMap.get(num) + frequencyMap.get(num + 1);
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }

}
