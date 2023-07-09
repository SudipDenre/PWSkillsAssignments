public class Aq52 {
    public static void main(String[] args) {
        int n = 5;
        int completeRows = calculateCompleteRows(n);
        System.out.println(completeRows);

    }
    public static int calculateCompleteRows(int n) {
        int rowCount = 0;
        int coinsNeeded = 1;
    
        while (n >= coinsNeeded) {
            rowCount++;
            n -= coinsNeeded;
            coinsNeeded++;
        }
    
        return rowCount;
    }
    
}
