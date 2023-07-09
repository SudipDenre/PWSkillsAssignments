public class Aq76 {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        boolean canShift = canShift(s, goal);     
        System.out.println(canShift);
    }
    public static boolean canShift(String s, String goal) {
        if (s.length() != goal.length()) {
            return false; // Different lengths, cannot become goal
        }
        
        String doubleS = s + s; // Concatenate s with itself
        return doubleS.contains(goal); // Check if goal is a substring of doubleS
    }
}
