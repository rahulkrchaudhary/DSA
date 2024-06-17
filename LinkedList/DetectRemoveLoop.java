public class DetectRemoveLoop extends Node{

    public DetectRemoveLoop() {
        super(0);
    }
    static void deleteLoop(Node head){
        Node slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(slow!=fast){
            return;
        }
        slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;

        }
        fast.next=null;

    }
    public static void main(String[] args) {
        Node head=new Node(5);
        head.next=new Node(23);
        head.next.next=new Node(453);
        head.next.next.next=new Node(45);
        head.next.next.next.next=new Node(4356);
        head.next.next.next.next.next=new Node(435);
        head.next.next.next.next.next.next=head.next;
        // head.next.next.next.next.next.next=new Node(45);
        deleteLoop(head);
        SLLimplimentation s =new SLLimplimentation(0);
        s.traversal(head);

    }
    
}
