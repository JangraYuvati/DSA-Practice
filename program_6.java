package Array;
import java.util.Scanner;

public class program_6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i]> max){
                max = arr[i];}

        }
        System.out.println("Maximum element in the array is: " + max);
        int secondMax = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i]> secondMax && arr[i] != max){
                secondMax = arr[i];}

        
    }
     System.out.println("Second Maximum element in the array is: " + secondMax);

    }
}
