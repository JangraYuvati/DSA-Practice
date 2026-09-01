public class program_24 {
    public static void main(String[] args) {
        int n = 20;
        int low =1, high = n;
        for (int i =0;i<n;i++) {
            int mid = (low + high) / 2;
            if (mid * mid == n) {
                System.out.println("Square root of " + n + " is " + mid);
                break;
            } else if (mid * mid < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            
        }
        System.out.println("Square root of " + n + " is " + high);
}}