package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class program_17 {
 public static void main(String[] args) {
     int[] a = {1,5,4,2,1,7,8,5,2,4};
     int[] b = {5,6,7,8,7,6,5,4,2,1};
     ArrayList<Integer> result = new ArrayList<>(); 
    Arrays.sort(a);
    Arrays.sort(b);
     int i = 0, j =0;
     while(i< a.length && j< b.length){
        if(a[i] == b[j]) {
            result.add(a[i]);
            i++;
            j++;
        } else if (a[i] < b[j]) {
            i++;
        } else {
            j++;
        }
    
     }
     System.out.println(result);

     

 }   
}
