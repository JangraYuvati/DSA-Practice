//max of positive and negative elements in an array
public class program_23 {
    public static void main(String[] args) {
        int[] arr = {-10, -5, -2, 0, 0, 1, 3, 5, 7};
        int n = arr.length;
        int low = 0, high = n - 1;
        int positiveCount = 0;
        int negativeCount = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        negativeCount = low;

        low = 0;
        high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        positiveCount = n - low;

        System.out.println("Count of positive elements: " + positiveCount);
        System.out.println("Count of negative elements: " + negativeCount);
    }
    
}
