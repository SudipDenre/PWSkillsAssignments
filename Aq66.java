import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Aq66 {
    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);      
        System.out.println(Arrays.toString(original));
    }

    public static int[] findOriginalArray(int[] changed) { 
        if (changed.length % 2 != 0) {
            return new int[0]; 
        }  
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        Arrays.sort(changed);
        int[] original = new int[changed.length / 2];
        int index = 0;      
        for (int num : changed) {
            if (countMap.getOrDefault(num, 0) == 0) {
                continue;
            }
            int doubledValue = num * 2;
            if (countMap.getOrDefault(doubledValue, 0) > 0) {
                original[index] = num;
                index++;
                countMap.put(num, countMap.get(num) - 1);
                countMap.put(doubledValue, countMap.get(doubledValue) - 1);
            }
        }
        if (index != original.length) {
            return new int[0]; 
        }      
        return original;
    }
}
