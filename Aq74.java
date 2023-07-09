public class Aq74 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String reversed = reverseWords(s);     
        System.out.println(reversed);
    }
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            
            reversedSentence.append(reversedWord).append(" ");
        }
        
        return reversedSentence.toString().trim();
    }
}
