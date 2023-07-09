import java.util.ArrayList;
import java.util.List;

class Aq37 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> missingRanges = new ArrayList<>();
        int next = lower;
        for (int num : nums) {
            if (num > next) {
                missingRanges.add(getRange(next, num - 1));
            }
            next = num + 1;
        }
        if (next <= upper) {
            missingRanges.add(getRange(next, upper));
        }
        return missingRanges;
    }

    private String getRange(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "->" + end;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        Aq37 solution = new Aq37();
        List<String> result = solution.findMissingRanges(nums, lower, upper);
        System.out.println("Output: " + result);
    }
}