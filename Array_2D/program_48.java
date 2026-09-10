//multiply matrix
public class program_48 {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {2, 1}};
        int[][] b = {{2, 0}, {-1, 3}};
        int n = a.length;

        int[][] c = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
