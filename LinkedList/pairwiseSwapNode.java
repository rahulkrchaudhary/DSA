public class pairwiseSwapNode extends Node{

    public pairwiseSwapNode() {
        super(0);
    }
    static void pairwiseSwap(Node head){
        // if(head==null || head.next==null){
        //     return head;
        // }
        Node curr=head;
        while(curr!=null && curr.next!=null){
            int temp=curr.data;
            curr.data=curr.next.data;
            curr.next.data=temp;
            curr=curr.next.next;
        }
        // return head;
    }
    static Node pairwiseSwapM1(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node curr=head.next.next;
        //handling 1st two node explicitly
        Node prev=head;
        head=head.next;
        head.next=prev;
        while(curr!=null && curr.next!=null){
             prev.next=curr.next;
             prev=curr;
             Node next=curr.next.next;
             curr.next.next=curr;
             curr=next;
        }
        // handling both even and odd nodes
        prev.next=curr;
        return head;
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
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        pairwiseSwap(head);
        // head=pairwiseSwapM1(head); 
        traversal(head);
    }

}
