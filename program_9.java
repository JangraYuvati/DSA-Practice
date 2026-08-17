//missing number in an array of size n-1 containing numbers from 1 to n
package Array;

import java.util.Scanner;
public class program_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n-1];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n-1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < n-1; i++) {
            System.out.print(arr[i] + " ");
        }
        int sum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int i = 0; i < n-1; i++) {
            arrSum += arr[i];
        }

        int missingNumber = sum - arrSum;
        System.out.println("\nThe missing number in the array is: " + missingNumber);
    }
}