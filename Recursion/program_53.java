// gcd with 2 mehtods using loops and recursion
package Recursion;

public class program_53 {
    public static void main(String[] args) {
        System.out.println("Recursive HCF: " + hcf(24, 60));

        int c = 24, d = 60;
        int hcff = 1;

        for (int i = 1; i <= c; i++) {
            if (c % i == 0 && d % i == 0) {
                hcff = i;
            }
        }

        System.out.println("Loop HCF: " + hcff);
    }

    public static int hcf(int a, int b) {
        if (a == 0) return b;
        return hcf(b % a, a);
    }
}
