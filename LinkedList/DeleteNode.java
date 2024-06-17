

public class DeleteNode extends Node {

    public DeleteNode(int x) {
        super(x);
    }
    static void deleteGivenNode(Node delNode){
        delNode.data=delNode.next.data;
        delNode.next=delNode.next.next;

    }
    public static void main(String[] args) {
        Node head=new Node(5);
        head.next=new Node(23);
        head.next.next=new Node(453);
        head.next.next.next=new Node(45);
        head.next.next.next.next=new Node(4356);
        head.next.next.next.next.next=new Node(435);
 
        head.next.next.next.next.next.next=new Node(45);
        deleteGivenNode(head.next);
        SLLimplimentation s =new SLLimplimentation(0);
        s.traversal(head);
    }

}
