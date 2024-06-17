class Node{
    Node next;
    int data;
    Node(int x){
        data=x;
        next=null;
    }
}
public class SortedInsertInSLL {
    static Node insertinSLL(Node head, int x){
        Node newnode=new Node(x);
        if(head==null){
            return newnode;
        }
        if(x<head.data){
            newnode.next=head;
            return newnode;
        }
        Node curr=head;
        while(curr.next.data<x && curr.next!=null){
            curr=curr.next;
        }
        newnode.next=curr.next;
        curr.next=newnode;
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(5);
        head.next=new Node(23);
        head.next.next=new Node(45);
        head.next.next.next=new Node(100);
        head=insertinSLL(head, 97);
        SLLimplimentation s =new SLLimplimentation(0);
        s.traversal(head);
    }
}
