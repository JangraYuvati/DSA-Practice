//Adding one to a number represented as an array 
package Array;
import java.util.Collections;
import java.util.Vector;

public class program_12 {
    public static void main(String[] args) {
        Vector<Integer> arr = new Vector<>();
        arr.add(9);
        arr.add(9);
        arr.add(9);
        int carry = 1;
        Vector<Integer> ans = new Vector<>();
        int n = arr.size();
        System.out.println("The elements of the vector are: " + arr);
        for(int i = n - 1; i >= 0; i--){
            if(arr.get(i) < 9){
                ans.add(carry+arr.get(i));
                carry = 0;
              }
              else {
                ans.add(0);
                carry = 1;
              }
    }
    if(carry == 1)
        ans.add(1);
    Collections.reverse(ans);
    System.out.println("The elements of the vector are: " + ans);
}}

