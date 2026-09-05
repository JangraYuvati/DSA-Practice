
//palandrome
public class program_34 {
    public static void main(String[] args){
        String s  = "yuvati";
        String s2 = "uayvit";
        char[] ch = s.toCharArray();
        char[] ch2 = s2.toCharArray();
        boolean isPalindrome = true;
        java.util.Arrays.sort(ch);
        java.util.Arrays.sort(ch2);
        for(int i = 0; i < ch.length; i++){
            if(ch[i] != ch2[i]){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }

    
}
