package Binary_Search;

public class program_22 {

    public static void main(String[] args) {
        int[] arr = {2,6,7,9,13,15,24,26};
        int n = arr.length;
        int x = 8;
        int low = 0, high = n - 1;
        
        while(low < high){
            int mid = (low + high + 1) / 2;
            if(arr[mid] < x){
                // Floor could be at mid or to the right
                low = mid;
            } 
            else {
                // arr[mid] >= x, go left
                high = mid - 1;
            }
        }
        
        if(arr[low] < x){
            System.out.println("Floor found at index " + low + " with value " + arr[low]);
        }
        else{
            System.out.println("No floor exists");
        }
    }
}