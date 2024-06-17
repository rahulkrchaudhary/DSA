public class floydCycleDetection extends Node {

    public floydCycleDetection() {
        super(0);
    }
    static boolean hasLoop(Node head){
        Node slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;

            }
        }
        return false;
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
        System.out.println(hasLoop(head));
    }
    
}
