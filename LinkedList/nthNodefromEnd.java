class Node{
    int data;
    Node next;
    public boolean visited;
    Node(int x){
        data=x;
        next=null;
    }
}
public class nthNodefromEnd {
    // using length of linked list
    static int printnthNodeM1(Node head, int n){
        if(head==null){
            System.out.println("list is empty");
        }
        int count=0;
        for(Node r=head; r!=null; r=r.next){
            count++;
        }
        if(count<n || n<=0) 
            return -1;
        Node curr=head;
        for(int i=1; i<(count-n+1); i++){
            curr=curr.next;
        }
        return curr.data;
    }
    // two pointer/references method
    static int printnthNodeM2(Node head, int n){
         
        if(head==null){
            System.out.println("list is empty");
        }
        Node first = head;
        for(int i=1; i<=n; i++){
            if(first==null){
                return -1;
            }
            first=first.next;
        }
        Node sec=head;
        while(first!=null){
            sec=sec.next;
            first=first.next;
        }
        return sec.data;
    }

    public static void main(String[] args) {
        Node head=new Node(5);
        head.next=new Node(23);
        head.next.next=new Node(45);
        head.next.next.next=new Node(456);
        head.next.next.next.next=new Node(4356);
        SLLimplimentation s =new SLLimplimentation(0);
        s.traversal(head);
        System.out.println(printnthNodeM1(head, 2));
    }
}
