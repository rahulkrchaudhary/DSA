public class RemoveDuplicatesfromSortedLL extends Node{

    public RemoveDuplicatesfromSortedLL(int  data) {
        super(data);
    }

    static Node  removeDuplicates(Node head){
        // MySolution
        //if(head==null || head.next==null){
            // 	    return head;
            // 	}
            // 	Node prev=head;
            // 	Node curr=head.next;
            // 	while(curr!=null){
            // 	    if(prev.data==curr.data){
            // 	        prev.next=curr.next;
            // 	        curr=prev.next;
            // 	    }else{
            // 	        prev=prev.next;
            // 	        curr=curr.next;
            // 	    }
            // 	}
            // 	return head;
            //Other Solution
            Node curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(5);
        head.next=new Node(23);
        head.next.next=new Node(45);
        head.next.next.next=new Node(45);
        head.next.next.next.next=new Node(4356);
        head=removeDuplicates(head);
        SLLimplimentation s =new SLLimplimentation(0);
        s.traversal(head);
    }
    
}
