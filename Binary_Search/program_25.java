public class program_25 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6};
        int n = arr.length;
        int low =0, high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;

            if(mid == 0 && arr[mid] != arr[mid + 1]){
                System.out.println("Unique element found at index " + mid + " with value " + arr[mid]);
                return;
            }
            if(mid == n - 1 && arr[mid] != arr[mid - 1]){
                System.out.println("Unique element found at index " + mid + " with value " + arr[mid]);
                return;
            }
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                System.out.println("Unique element found at index " + mid + " with value " + arr[mid]);
                return;
            }

            if(mid % 2 == 0){
                if(arr[mid] == arr[mid + 1]){
                    low = mid + 2;
                } else {
                    high = mid;
                }
            } else {
                if(arr[mid] == arr[mid - 1]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
    
        

        }

    }
    

