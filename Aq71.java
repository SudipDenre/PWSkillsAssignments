import java.util.HashMap;
import java.util.Map;

public class Aq71 {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean isIsomorphic = isIsomorphic(s, t);
        
        System.out.println(isIsomorphic);
    }


    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false; // Different lengths, not isomorphic
        }
        
        Map<Character, Character> charMap = new HashMap<>();
        Map<Character, Boolean> usedChars = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if (!charMap.containsKey(sChar)) {
                if (usedChars.containsKey(tChar) && usedChars.get(tChar)) {
                    return false; // Character in t is already used by another character in s
                }
                
                charMap.put(sChar, tChar);
                usedChars.put(tChar, true);
            } else {
                if (charMap.get(sChar) != tChar) {
                    return false; // Character in s is already mapped to a different character in t
                }
            }
        }
        
        return true; // Strings are isomorphic
    }
}
