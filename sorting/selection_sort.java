package sorting;


public class selection_sort {
     
    @SuppressWarnings("ImplicitArrayToString")
    public static void main(String[] args){
        int[] arr = {5,4,6,8,1,2,9,4,8,2};
        int n = arr.length;
        
        
        
        for(int i =0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int mindx = 1;
            for(int j =i; j<n; j++){
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
    
    }
}