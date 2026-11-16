package LinkedList;

public class program_58 {
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
    void middle_value(){
        calculateSize();
        Node temp = head;
        for(int i = 0; i < size/2; i++){
            temp = temp.next;
        }
        System.out.println(temp.value);
    }
public static void main(String[] args) {
        
                program_58 ll = new program_58();
        Node a = ll.new Node(10);
        Node b = ll.new Node(20);
        Node c = ll.new Node(30);
        Node d = ll.new Node(40);
        Node e = ll.new Node(50);
       // Node f = ll.new Node(60);
        ll.head = a;
        ll.tail = e;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
      //  e.next = f;
        e.next = null;
       // ll.size = 6;
        ll.middle_value();
    }

}
