public class reverseLLinGroup extends Node{

    public reverseLLinGroup(int x) {
        super(x);
    }
    static Node reversNodeRecursive(Node head, int k){
        Node curr=head, prev=null, next=null;
        int count=0;
        while(curr!=null && count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            Node rest_head=reversNodeRecursive(next, k);
            head.next=rest_head;
        }
        return prev;
    }
    static Node reversNodeIterative(Node head, int k){
        Node curr=head, prevFirst=null;
        boolean isFirstPass=true;
        while(curr!=null){
            Node first=curr, prev=null;
            int count=0;
            while(curr!=null && count<k){
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                count++;
            }
            if(isFirstPass){
            head=prev;
            isFirstPass=false;
            }else{
                prevFirst.next=prev;
            }
            prevFirst=first;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(5);
        head.next=new Node(23);
        head.next.next=new Node(45);
        head.next.next.next=new Node(45);
        head.next.next.next.next=new Node(4356);
        head.next.next.next.next.next=new Node(435);
        head.next.next.next.next.next.next=new Node(45);
        head=reversNodeRecursive(head, 3);
        head=reversNodeIterative(head, 3);
        SLLimplimentation s =new SLLimplimentation(0);
        s.traversal(head);
    }

    
}
