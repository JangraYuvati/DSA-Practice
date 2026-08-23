//first occurance and last occurance
package Binary_Search;

public class program_19 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,5,5,5,6,7,8};
        int target = 5;
        int n = arr.length;
        int index = 0;

        int high = n-1, low = 0;
         while(low<high) {
            int mid = (high+low)/2;
            if(arr[mid]< target){
                low = mid +1;

            }
            else if(arr[mid]> target){
                high = mid-1;
            }

            else {
               index = mid;
               high = mid -1;
            }
         }
         System.out.println(index);
         //last occurance 
           while(low<high) {
            int mid = (high+low)/2;
            if(arr[mid]< target){
                low = mid +1;

            }
            else if(arr[mid]> target){
                high = mid-1;
            }

            else {
               index = mid;
               low = mid +1;
            }
         }
         System.out.println(index);

    }
}
