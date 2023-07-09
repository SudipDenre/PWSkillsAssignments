public class Aq36 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        SingleNumber solution = new SingleNumber();
        int result = solution.singleNumber(nums);
        System.out.println("Output: " + result);
    }
}
class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}