//min element from max elemnt of each row

package Array_2D;

public class program_40 {
    public static void main(String[] args) {
        int[][] arr = {{2,7,5,3},{8,2,5,1},{3,1,4,8},{4,6,1,2},{7,3,4,6}};
        int[] maxArr = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            int max = arr[i][0];
            for(int j = 1; j< arr[i].length; j++){
                if(arr[i][j]> max){
                    max = arr[i][j];
                }
            }
            maxArr[i] = max;
        }

        int min = maxArr[0];
        for(int i = 1; i< maxArr.length; i++){
            if(maxArr[i] < min){
                min = maxArr[i];
            }
        }
        System.out.println(min);
    }
}
