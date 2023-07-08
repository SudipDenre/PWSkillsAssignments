import java.util.HashSet;
public class Aq22 {
    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int maxCandies = distributeCandies(candyType);
        System.out.println(maxCandies);

    }
    public static int distributeCandies(int[] candyType) {
        int maxCandies = candyType.length / 2; 
        HashSet<Integer> uniqueCandies = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }
        return Math.min(uniqueCandies.size(), maxCandies);
    }

}
