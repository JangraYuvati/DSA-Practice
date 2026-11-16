package LinkedList;

import java.util.Scanner;

public class program_59 {
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
    void kth_value(){
        Node slow = head;
        Node fast = head;
        calculateSize();
       System.out.println("enter the value of k: ");
         Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for(int i = 0; i < k; i++){
            if(fast == null){
                System.out.println("k is greater than the size of the linked list");
                return;
            }
            fast = fast.next;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(slow.value);
    }
public static void main(String[] args) {
        
                program_59 ll = new program_59();
        Node a = ll.new Node(10);
        Node b = ll.new Node(20);
        Node c = ll.new Node(30);
        Node d = ll.new Node(40);
        Node e = ll.new Node(50);
       Node f = ll.new Node(60);
        ll.head = a;
        ll.tail = f;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
      //  e.next = f;
        e.next = f;
        f.next = null;
       // ll.size = 6;
        ll.kth_value();
    }

}