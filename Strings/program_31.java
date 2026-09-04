import java.util.Scanner;
public class program_31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a string :");
        String str = sc.nextLine();
        int length = str.length();
        for(int i = 0; i < length; i++){
           if(str.charAt(i)== ' '){
               continue; 
            }
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                  System.out.print(str.charAt(i) + " ");
            }
            
        }
    }
}