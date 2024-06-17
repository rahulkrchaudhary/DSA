import java.util.HashMap;

class Node{
    int data;
    Node next;
    Node random;
    Node(int x){
        data=x;
        next=null;
        random=null;
    }
}
public class cloneLinkedListwithRandom {
    static Node cloneM1(Node head){
        HashMap<Node, Node>m = new HashMap<>();
        for(Node curr=head; curr!=null; curr=curr.next){
            m.put(curr, new Node(curr.data));
        }
        for(Node curr=head; curr!=null; curr=curr.next){
            Node clone=m.get(curr);
            clone.next=m.get(curr.next);
            clone.random=m.get(curr.random);
        }
        return m.get(head);
    }
    static Node cloneM2(Node head1){
        //step-1 insert clone node alternatively
        Node curr=head1;
        while (curr!=null){
            Node next=curr.next;
            curr.next=new Node(curr.data);
            curr.next.next=next;
            curr=next;
        }
        //step-2 connect clone nodes with random
        for(curr=head1; curr!=null; curr=curr.next.next){
            curr.next.random=(curr.random==null)?null:curr.random.next;
        }
        // step-3 sepreste the orignal and clone node
        Node head2=head1.next;
        Node clone=head2;
        for(curr=head1; curr!=null; curr=curr.next){
            curr.next=curr.next.next;
            clone.next=(clone.next!=null)? clone.next.next:null;
            clone=clone.next;

        }
        return head2;
    }
    public static void traversal(Node head){
        int count=0;
        if(head==null){
            System.out.println("Linked List is empty");
        }
        Node curr=head;
        while ( curr != null) {
            count++;
            System.out.println(curr.data +" ");
            curr=curr.next;
        }
        System.out.println("the count is:"+count);
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node n1=new Node(5);
        Node n2=new Node(20);
        Node n3=new Node(15);
        Node n4=new Node(20);
        // Node n5=new Node(25);
        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        // n4.next=n5;
        head.random=n2;
        n1.random=n3;
        n2.random=head;
        n3.random=n4;
        n4.random=n3;
        // n5.random=n2;
        Node head1=cloneM2(head);
        traversal(head1);
    }

}
