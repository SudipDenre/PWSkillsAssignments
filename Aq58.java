import java.util.Arrays;
import java.util.HashSet;

public class Aq58 {
    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] originalArray = findOriginalArray(changed);

        System.out.println(Arrays.toString(originalArray));
    }

    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0]; 
        }
        int[] original = new int[changed.length / 2];
        HashSet<Integer> set = new HashSet<>();
        for (int num : changed) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                int originalNum = num / 2;
                set.add(originalNum);
            }
        }
        if (set.isEmpty()) {
            return new int[0]; 
        }
        int i = 0;
        for (int num : changed) {
            if (set.contains(num)) {
                original[i] = num;
                i++;
                set.remove(num);
            }
        }
        return original;
    }

}
