import java.util.Scanner;
public class program_26 {
    static int sqrt(int n){
        int low = 1, high = n;
        int ans = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(mid*mid == n){
                return mid;
            }
            if(mid*mid < n){
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of coins:");
    int n = sc.nextInt();
    int k = (sqrt(8 * n + 1) - 1) / 2;
    System.out.println("Maximum number of complete rows: " + k);

    
    
        
    }}