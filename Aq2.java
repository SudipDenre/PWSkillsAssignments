public class Aq2 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        Solution obj = new Solution();
        int result = obj.removeElement(nums, val);

        System.out.println("k = " + result);
        System.out.print("nums = [");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i]);
            if (i != result - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]"); 

    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
