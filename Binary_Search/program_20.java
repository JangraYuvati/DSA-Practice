// mountain peak 

package Binary_Search;

public class program_20 {
    public static void main(String[] args){
        int[] arr = {-1,0,1,2,5,6,8,6,3};
        int n = arr.length;
        int high = n-1, low = 0;
        
        while(low < high){
            int mid = (high + low) / 2;
            // If mid element is greater than its right neighbor, peak is on left or at mid
            if(arr[mid] > arr[mid+1]){
                high = mid;
            }
            // Otherwise peak is on the right
            else{
                low = mid + 1;
            }
        }
        
        System.out.println("Peak element found at index: " + low + " with value: " + arr[low]);
    }
    
}
