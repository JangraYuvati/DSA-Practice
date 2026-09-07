package Array_2D;

public class program_39 {
    public static void main(String[] args) {
        int[][] arr = {{2,7,5,3},{8,2,5,1},{3,1,4,8},{4,6,1,2},{7,3,4,6}};
        int maxsum = 0;
        int row = -1;
        for(int i = 0; i< arr.length; i++){
            int sum = 0;
            for(int j =0; j< arr[0].length; j++){
                sum += arr[i][j];
            }
            if(sum> maxsum){
                maxsum =sum;
                row = i;
            }
           
        }
         System.out.println("Max sum: " + maxsum + " at row " + row);
    }
    
}
