// delete value from linked list
import java.util.Scanner;
package LinkedList;

public class program_57 {
    
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    Node head;
    Node tail = null;
    int size = 0;

    void calculateSize(){

        size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
    }
    void delete_value(int value){
        Node temp = head;
       System.out.println("enter the target: ");
       Scanner scanner = new Scanner(System.in);
       int target = scanner.nextInt();
       for(int i =0; i < size; i++){
        
        if(temp.value == target){
           if(temp == head){
            head = head.next;
                if(head == null){
                    tail = null;
                }
            } 
            temp.value = temp.next.value;
            temp.next = temp.next.next;
           }
            break;
        }
       }
    }
    

