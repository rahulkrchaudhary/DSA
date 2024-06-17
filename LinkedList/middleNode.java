class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class middleNode {
    static void midNode(Node head){
        // navie solution
        if(head==null){
            System.out.println("list is empty");
        }
        int count=0;
        Node curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        curr=head;
        for(int i=0; i<count/2; i++){
            curr=curr.next;
        }
        System.out.println(curr.data);
        
    }
    // slow and fast references method
    static void midNodeM2(Node head){
        // efficient solution
        if(head==null){
            System.out.println("list is empty");
        }
        Node slow=head, fast=head;
        while(fast!=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
    public static void main(String[] args) {
        Node head=new Node(5);
        head.next=new Node(23);
        head.next.next=new Node(45);
        midNodeM2(head);
    }
}
