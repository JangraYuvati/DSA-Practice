// factorial of n

package Recursion;

public class program_51 {
    static int fact =1;
    public static void main(String[] args) {
        
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
