// rotate array by d elements in anti-clockwise direction

package Array;
import java.util.Arrays;
import java.util.Scanner;
public class program_8 {
    public static void main(String args []) {
        int n;
        int[] arr;
        System.out.println("Enter the size of the array");
        Scanner sc=  new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i =0; i< n; i++){
            System.out.println("Enter the element at index " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are: " + Arrays.toString(arr) );
        System.out.println("Enter the number of rotations: ");
        int d = sc.nextInt();
    int i =0; int j = d-1;
    while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
    System.out.println("The elements of the array after first rotation are: ");
    for(i = 0; i < d; i++){
        System.out.print(arr[i] + " ");
    }
    

    int k = d; int l = n-1;
    while(k<l){
        int temp = arr[k];
        arr[k] = arr[l];
        arr[l] = temp;
        k++;
        l--;
     for(i = 0; i < n; i++){
    }
   System.out.println("The elements of the array after second rotation are: ");
   for(k = d; k < n; k++){
        System.out.print(arr[k] + " ");
    }
    i = 0; l = n-1;
    while(i<l){
         temp = arr[i];
        arr[i] = arr[l];
        arr[l] = temp;
        i++;
        l--;
      
    }
    System.out.println("The elements of the array after rotation are: ");
     for( i =0; i< n; i++){
             
            System.out.print(arr[i] + " ");

            
        }
}
}}