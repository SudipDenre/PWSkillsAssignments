import java.util.HashMap;
import java.util.Map;

public class Aq72 {
    public static void main(String[] args) {
        String num = "69";
        boolean isStrobogrammatic = isStrobogrammatic(num);
        
        System.out.println(isStrobogrammatic);
    }

    public static boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');
        
        int left = 0;
        int right = num.length() - 1;
        
        while (left <= right) {
            char leftChar = num.charAt(left);
            char rightChar = num.charAt(right);
            
            if (!map.containsKey(leftChar) || map.get(leftChar) != rightChar) {
                return false; // Left character does not have a mapping or mapping is not equal to right character
            }
            
            left++;
            right--;
        }
        
        return true; // Number is strobogrammatic
    }
}
