package sorting;

import java.util.Arrays;

public class program_16 {
    public static void main(String[] args){
        int[] arr = {1,5,6,7,9,2,4,8,3,1};
        int target = 8;
        Arrays.sort(arr);
        System.err.println(Arrays.toString(arr));
        int i = 0, j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j] == target) {
                System.out.println("Target found: " + arr[i] + " + " + arr[j]);
                i++;
                j--;
            }
            else if (arr[i]+arr[j] < target) {
                i++;
            }
            else {
                j--;
            }

        }
       

        

    }
    
}
