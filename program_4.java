//search in array

package Array;


import java.util.Scanner;

public class program_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the element to find in array: ");
        int x = sc.nextInt();
        int[] arr = {1, 2, 3, 4, 5};

        for(int i = 0; i<= arr.length; i++){
            if(arr[i] == x){
                System.out.println("Element found at index: " + i);
                break;
            }
            else if(i == arr.length - 1){
                System.out.println("Element not found in the array");
            }
        }
    }
}
 