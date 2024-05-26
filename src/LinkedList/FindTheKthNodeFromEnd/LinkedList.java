package LinkedList.FindTheKthNodeFromEnd;

public class LinkedList {

    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

     public Node findKthFromEndMyWay(int k){

        int length=getLength();
        int kthNode=0;

        if(length<k){
            return null;
        }
        else if(length == k){
            return getHead();
        }else if(length==1){
            return getTail();
        }else{
            kthNode=length-(k-1);
            Node temp=getHead();
            int i=1;
            while(i<kthNode){
                temp=temp.next;
                i++;
            }
            return temp;
        }
     }

    private int getLength() {
        Node temp=getHead();
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;

        }
       return length;
    }

    //Two pointer solution

    public Node findKthFromEnd(int k){

         if(getHead()==null){
             return null;
         }
        Node slow=getHead();
        Node fast=getHead();
        int i=0;
         while(i<k){
             if(fast!=null) {
                 fast = fast.next;
             }else{
                 return null;
             }
             i++;
         }
         while(fast!=null){
             fast=fast.next;
             slow=slow.next;
         }
         return slow;
    }
}


