// print ele column wise

package Array_2D;

public class program_41 {
    public static void main(String[] args) {
        int[][] arr  =  {{2,7,5,3},{8,2,5,1},{3,1,4,8},{4,6,1,2},{7,3,4,6}};
        for(int j=0; j<arr[0].length; j++){
            for(int i =0; i<arr.length; i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
