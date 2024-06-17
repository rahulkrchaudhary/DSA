import java.util.ArrayList;

// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }
public class reverseLinkedList extends Node {
    reverseLinkedList(int x) {
        super(x);
        //TODO Auto-generated constructor stub
    }
    //navie solution
    // auxillary space-O(n)
    static Node reverse(Node head){
        ArrayList<Integer> list = new ArrayList<>();  
        for(Node r=head; r!=null; r=r.next){
            list.add(r.data);
        }
        for(Node curr=head; curr!=null; curr=curr.next){
            curr.data=list.remove(list.size()-1);
        }
        return head;
    }
    static Node reverseM2(Node head){
        if(head==null){
            return  null;
        }
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return  prev;
    }
    static Node reverseRecursiveM1(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node rest_head=reverseRecursiveM1(head.next);
        Node rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return rest_head;
    }
    static Node reverseRecursiveM2(Node curr, Node prev) { 
        if(curr==null){
            return prev;
        }
        Node next=curr.next;
        curr.next=prev;
        return reverseRecursiveM2(next,curr);
    }
    public static void main(String[] args) {
        Node head=new Node(5);
        head.next=new Node(23);
        head.next.next=new Node(45);
        head.next.next.next=new Node(456);
        head.next.next.next.next=new Node(4356);
        // head=reverse(head);
        // head=reverseM2(head);
        // head=reverseRecursiveM1(head);
        head=reverseRecursiveM2(head, null);
        SLLimplimentation s =new SLLimplimentation(0);
        s.traversal(head);
    }
    
}
