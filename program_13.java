// merge 2 sorted arrays into a single sorted array

package Array;

public class program_13 {
    public static void main(String[] args){
        int a[] = {1, 3, 5, 7};
        int b[] = {2,7,45,67,89, 90};
        int c[] = new int[a.length + b.length];
        merge(a, b, c);
        System.out.println("The elements of the merged array are: ");
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }
    }
    
    public static void merge(int a[], int b[], int c[]){

     int i =0, j=0, k =0;
     while(i < a.length && j < b.length){
        if(a[i]< b[j]){
            c[k++] = a[i++]; // c[k] = a[i] k++ i++ 
        
        }  
        else
            c[k++] = b[j++]; // c[k] = b[j] k++ j++   
        }

     if(i == a.length){

        
        while(j < b.length){
            c[k++] = b[j++];
        }
     }
     else{
        while(i < a.length){
            c[k++] = a[i++];
        }
     }   
     }
    }
        

