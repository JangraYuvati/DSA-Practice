//multiply odd indexed elements by 2 and add 10 in even indexed elements 

package Array;

public class program_3 {
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        int multiply = 1;
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            if(i%2 == 0){
                sum += arr[i] +10;
                System.err.println(sum);
            
            }
            else{
                multiply *= arr[i] * 2;
                System.err.println(multiply);
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + multiply);
    }
}
