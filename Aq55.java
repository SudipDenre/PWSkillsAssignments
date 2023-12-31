public class Aq55 {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;
        int distanceValue = calculateDistanceValue(arr1, arr2, d);
        System.out.println(distanceValue);

    }

    public static int calculateDistanceValue(int[] arr1, int[] arr2, int d) {
        int distanceValue = 0; 
        for (int num1 : arr1) {
            boolean isValid = true;  
            for (int num2 : arr2) {
                if (Math.abs(num1 - num2) <= d) {
                    isValid = false;
                    break;
                }
            }  
            if (isValid) {
                distanceValue++;
            }
        } 
        return distanceValue;
    }
    
}
