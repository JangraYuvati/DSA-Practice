//segregate 0s and 1s in an array
package Array;


import java.util.Scanner;

public class program_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter element (0 or 1):");
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are: " + java.util.Arrays.toString(arr));
        int zero_sum = 0;
        int one_sum = 0;
        for (int ele : arr) {
            if (ele == 0) {
                zero_sum++;
                System.out.print("Zero ");
            } else {
                one_sum++;
                
            }

        }
        for(int i = 0; i < zero_sum; i++){
            arr[i] = 0;
        }
        for(int i = zero_sum; i < zero_sum + one_sum; i++){
            arr[i] = 1;
        }
        
        System.out.println("The elements of the array are: " + java.util.Arrays.toString(arr));
    }}
