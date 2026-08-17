package Array;

public class program_14 {

    public static void main(String[] args){
        int[] arr = {0,1,2,2,2,1,0,0,1,2};
        System.out.println("The elements of the array are: " + java.util.Arrays.toString(arr));
        int zero_count = 0;
        int one_count = 0;
        int two_count = 0;
        for(int i = 0; i<= arr.length-1; i++){
            int ele = arr[i];
            if(ele == 0){
                zero_count++;
            }
            else if(ele == 1){
                one_count++;
            }
            else{
                two_count++;
            }
        }

        for(int i = 0; i< zero_count; i++){
            arr[i] = 0;
        }
        for(int i = zero_count; i< zero_count + one_count; i++){
            arr[i] = 1;
        }
        for(int i = zero_count + one_count; i< arr.length; i++){
            arr[i] = 2;
        }
        System.out.println("The elements of the sorted array are: " + java.util.Arrays.toString(arr));
    }
    
}
