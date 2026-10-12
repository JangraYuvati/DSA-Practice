// Two Sum Problem: Find all pairs in an array whose sum is equal to 2

package Array;

import java.util.Scanner;
public class program_5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array: ");

        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of array: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        boolean pairFound = false;
        for(int i =0; i < size; i++){
            for(int j = i+1; j < size; j++){
                if(arr[i] + arr[j] == 2){
                    System.out.println("\nPair found: (" + arr[i] + ", " + arr[j] + ")");
                    pairFound = true;
                }
            }
        }

        if(!pairFound){
            System.out.println("\nNo pair found with sum 2");
        }
    }
}
