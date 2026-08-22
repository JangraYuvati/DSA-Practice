package sorting;

import java.util.Arrays;

public class insertion_sort {
   public static void main(String[] args) {
       int[] arr = {1,3,5,6,7,8,3,4};
       for(int i =0; i< arr.length;i++){
          int j =i;
          while(j>0 && arr[j] < arr[j-1]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
          }
          System.out.println(Arrays.toString(arr));
       }
   }
}
