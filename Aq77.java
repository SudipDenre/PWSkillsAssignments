public class Aq77 {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        boolean areEqual = backspaceCompare(s, t);       
        System.out.println(areEqual); 
    }
    public static boolean backspaceCompare(String s, String t) {
        String finalS = processString(s);
        String finalT = processString(t);
        
        return finalS.equals(finalT);
    }
    
    private static String processString(String str) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
