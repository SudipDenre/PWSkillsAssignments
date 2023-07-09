public class Aq75 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String reversed = reverseStr(s, k);       
        System.out.println(reversed);
    }
    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        
        for (int start = 0; start < chars.length; start += 2 * k) {
            int end = Math.min(start + k - 1, chars.length - 1);
            reverseSubstring(chars, start, end);
        }
        
        return new String(chars);
    }
    
    private static void reverseSubstring(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
