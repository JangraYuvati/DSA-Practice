package Array_2D;
//search in row column sorted matrix
public class program_46 {
    public static void main(String[] args){
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{8,21,23,26,30}};
       int n = arr[0].length;
       int target = 17;
        int i = 0,j =n-1;
        while(i <=0|| j < arr.length){
            if(arr[i][j] == target){
                System.out.println("element found at index " + i + j );
            }
            if(arr[i][j] < target){
                i++;
            }
            else j--;

        }
    }
}
