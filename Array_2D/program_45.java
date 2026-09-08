import java.util.ArrayList;

class program_45 {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

                for(int i = 0; i < 5; i++){
                        arr.add(new ArrayList<>());

            for(int j=0;j<=i;j++){
                            if(j == 0 || j == i){
                                arr.get(i).add(1);
               
                            } else {
                                arr.get(i).add(arr.get(i-1).get(j) + arr.get(i-1).get(j-1));
                            }
               System.out.print(arr.get(i).get(j));
            }
            System.out.println();
            
        }

    }
}