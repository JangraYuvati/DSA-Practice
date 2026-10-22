package Recursion;

public class program_55 {
    public static void main(String[] args) {
        System.out.println(ways(3, 3));
    }
    public static int ways(int m, int n) {
        if(m==1 || n==1) return 1;
        return ways(m,n-1)+ ways(m-1,n);
        
    }
    
}
