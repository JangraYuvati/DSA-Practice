// wave array

package Array;
import java.util.Scanner;

public class program_11 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int temp;
        for(int i =0; i < arr.length; i=i+2){
            if(i == arr.length-1) break;
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.println("The elements of the array are: " + java.util.Arrays.toString(arr));


    }

}