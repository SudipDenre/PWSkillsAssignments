import java.util.HashSet;
public class Aq6 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean hasDuplicates = containsDuplicate(nums);
        System.out.println(hasDuplicates);

    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
        if (set.contains(num)) {
            return true;
        }
        set.add(num);
    }
    return false;
}

}
