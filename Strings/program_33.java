//print all substrings

public class program_33 {
    public static void main(String[] args){
        String s  = "Yuvati";
        
        String temp = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){ 
                temp = s.substring(i, j);
                System.out.println(temp);

                

            }
        }
    }

}
