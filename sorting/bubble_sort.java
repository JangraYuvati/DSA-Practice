package sorting;

public class bubble_sort {

    public static void print(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.err.print(arr[i] + " ");

        }
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,0,2,3,1};
    int n = arr.length;
    int temp;
    
        for(int i=0; i<n-1;i++){
            for(int j =0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
     
            }
            print(arr);
            System.err.println();
        }
    }
}
