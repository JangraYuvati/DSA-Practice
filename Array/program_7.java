// Reverse an array

package Array;

public class program_7 {
    public static void main(String args[]) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;

        for(int i =0; i< n; i++){
            int j = n-i-1;
            System.out.print(arr[j] + " ");

            
        }
        System.out.println("second method");

         // 2nd method
        int i = 0;
        int j =n-1;

       

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            
        }
        for(int k =0; k< n; k++){
            System.out.print(arr[k] + " ");
        }


    }
}