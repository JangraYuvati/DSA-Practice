package sorting;

public class program_18 {
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,2,3,1,9,8};
        int k  = 4;

        for(int i = 0; i< k; i++){
            int min = Integer.MAX_VALUE;
            int mindx = 1;
            for (int j = i; j<arr.length; j++) {
                if(arr[j]<min){
                     mindx = j;
                     min = arr[j];
                }
                
            }
             int temp = arr[i];
          arr[i] = arr[mindx];
          arr[mindx] = temp;
          System.out.println(java.util.Arrays.toString(arr));
         
        }
    System.out.println(arr[k-1]);

    }
    
}
