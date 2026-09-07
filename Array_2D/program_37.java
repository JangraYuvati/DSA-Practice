package Array_2D;

import java.util.Scanner;
public class program_37 {
    public static void main(String[] args){
        int[][] arr = new int[4][5];
        System.out.println("enter array ele");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int sum = 0;
        for(int i =0; i< arr.length; i++){
            for(int j=0; j < arr[i].length; j++){
                sum += arr[i][j]; 

            }
            
        }
System.out.println(sum);

    }
}