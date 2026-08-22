package Binary_Search;

public class binary_search {
    public static void main(String[] args){
        int[] arr = {1,5,78,650,773,774,880,998,7654,55532,56666};
        int n = arr.length;
        int low = 0, high = n-1;
        int target = 775;
                while(low <= high){
            int mid = (low+high)/2;
                     if(arr[mid] < target){
             low = mid+1;
                     } else if(arr[mid] > target){
            high = mid-1;
                     } else {
                        System.out.println("Target found at index " + mid);
                        break;
           }
        }
    }
}
