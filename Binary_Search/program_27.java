import java.util.Scanner;
public class program_27 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,10,1,2,3};
        int n = arr.length;
        int low = 0, high = n - 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element to search in the rotated sorted array:");
        int target = sc.nextInt();

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                System.out.println("Target element is on index: " + mid);
                return;
            }

            if (arr[low] <= arr[mid]) { // left half is sorted
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // right half is sorted
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        System.out.println("Target element not found");
    }
}
