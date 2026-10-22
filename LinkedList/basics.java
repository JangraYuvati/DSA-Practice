package LinkedList;

import java.util.Scanner;
//package LinkedList;
class LinkedList {
    class Node{
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    Node head;
    Node tail = null;
    int size = 0;

    void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void delete(int index){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return;
        }
        //delete at node
        if(index == 0){
            head = head.next;
            if(head == null){
                tail = null;
            }
        } // delete at index
         else {
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
 // delete at tail
        
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }
        }
        size--;
    }

    void insert(int index, int value){
        Node temp = head;
        //create new node
        Node newNode = new Node(value);
       
        
        if(index == 0){
            newNode.next = head;
            head = newNode;
        }
        else if(index == size){
            tail.next = newNode;
            tail = newNode;
        }
        else{
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;}
        
    }
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
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
        e.next = f;
        f.next = null;
        ll.size = 6;
        ll.display(ll.head);
        //delete at tail
        ll.delete(5);
        ll.display(ll.head);
        //delete at head
        ll.delete(0);
        ll.display(ll.head);
        //delete at index
        ll.delete(2);
        ll.display(ll.head);

        //insert at head
        ll.insert(0, 5);
        ll.display(ll.head);
        //insert at tail
        ll.insert(5, 70);
        ll.display(ll.head);
        //insert at index
        ll.insert(3, 35);
        ll.display(ll.head);
    }
}