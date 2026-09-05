public class program_35 {
    public static void main(String[] args){
        String s  = "aabbcccddhhqqqqxxx";
        char[] ch = s.toCharArray();
        int i = 0, j = 0;
        int frequency = 0;
        int maxFrequency = 0;
        while(j<ch.length){
            if(ch[i]==ch[j]){
                j++;
            }
            if(j == ch.length || ch[i]!=ch[j]){
                frequency = j - i;
                if(frequency > maxFrequency){
                    maxFrequency = frequency;
                }
                i = j;
            }
            

        }
        System.out.println("Max Frequency: " + maxFrequency);
}}