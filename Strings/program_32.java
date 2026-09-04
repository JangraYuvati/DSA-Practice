public class program_32 {
    public static void main(String[] args) {
        String s = "racecar";
        int i = 0, j = s.length() - 1;
        boolean ans = true;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println("The given string is not a palindrome");
                ans = false;
                break;
            }
            i++;
            j--;
        }

        if (ans) {
            System.out.println("The given string is a palindrome");
        }
    }
}
