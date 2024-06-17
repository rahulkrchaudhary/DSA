class Node{
    Node next;
    Node prev;
    int data;
    Node(int x){
        data=x;
        next=null;
        prev=null;
    }
}
public class CDLLimplimentation extends Node{
    CDLLimplimentation(int x) {
        super(x);
        //TODO Auto-generated constructor stub
    }
    static void print(Node head){
        if(head==null){
            System.out.println("list is empty");
        }
        System.out.println(head.data);
        for(Node r=head.next; r!=head; r=r.next){
            System.out.println(r.data);
        }
        
    }
    static Node insertAtBegining(Node head, int x){
        Node newnnode=new Node(x);
        if(head==null){
            newnnode.next=newnnode;
            newnnode.prev=newnnode;
            return newnnode;
        }
        newnnode.prev=head.prev;
        newnnode.next=head;
        head.prev.next=newnnode;
        head.prev=newnnode;
        return newnnode;
    }
    static Node insertEnd(Node head, int x){
        Node curr=insertAtBegining(head, x);
        return curr.next;
    }
    public static void main(String[] args) {
        // circular doubly linked list
        Node head=new Node(12);
        Node temp1=new Node(23);
        Node temp2=new  Node(45);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=head;
        head.prev=temp2;
        temp1.prev=head;
        temp2.prev=temp1;
        head=insertAtBegining(head,52 );
        head=insertEnd(head, 3);
        print(head);
    }
    
}
