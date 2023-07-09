import java.util.Arrays;

public class Aq65 {
    public static void main(String[] args) {
        int[] nums1 = {5,3,4,2}, nums2 = {4,2,2,5};
        System.out.println(minProductSum(nums1, nums2));
    }
    public static int minProductSum(int[] nums1, int[] nums2) {
        int n = nums1.length;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int minProductSum = 0;
        
        for (int i = 0; i < n; i++) {
            minProductSum += nums1[i] * nums2[n - i - 1];
        }
        
        return minProductSum;
    }
}
