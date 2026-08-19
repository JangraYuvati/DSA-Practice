// move all zeros to end
package sorting;

import java.util.Arrays;

public class program_15 {
    public static void main(String[] args) {
        int[] arr = {5,2,0,9,0,8,0,7,6,5,0,0,2,1,0};
        int n = arr.length;
        int swap =0;
        for(int i =0; i<n-1;i++){
            for(int j =0; j<n-1;j++){
                if(arr[j] ==0){
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap +=1;

                }
                System.err.println(Arrays.toString(arr));
                System.err.println(swap);
            }
        }
    }
}
