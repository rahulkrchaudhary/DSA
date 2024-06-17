class Node{
    Node next;
    int data;
    Node(int x){
        data=x;
        next=null;
    }
}
public class segregateEvenNoddNode {

    // public segregateEvenNoddNode() {
    //     super(0);
    // }
    // its not working
    // static Node evenNoddnodeM1(Node head){
    //      Node last=head;
    //      while(last.next!=null){
    //          last=last.next;
    //      }
    //      Node curr=head;
    //      Node till=last;
    //      boolean isfirstEvennode=true;
    //      Node firstEvennode=null;
    //      if(head.data%2!=0){
    //         Node newnNode=new Node(head.data);
    //         last.next=newnNode;
    //         last=newnNode;
    //         // head=head.next;
            
    //      }
    //      while(curr!=till){
            

    //         if(curr.next.data%2!=0){
    //             Node newnNode=new Node(curr.next.data);
    //             last.next=newnNode;
    //             last=newnNode;
    //             curr.next=curr.next.next;

    //         } 
    //         else{
    //             if(isfirstEvennode){
    //                 firstEvennode=curr;
    //                 isfirstEvennode=false;
    //             }
    //         }
    //         curr=curr.next;

             
    //      }
    //      return firstEvennode;

    // }
    static Node EvenNoddnode(Node head){
        Node evenstart=null,evenend=null,oddstart=null,oddend=null;
        Node curr=head;
         
        while(curr!=null){
            if(curr.data%2==0){
                if(evenstart==null){
                    evenstart=curr;
                    evenend=curr;
                }else{
                    evenend.next=curr;
                    evenend=evenend.next;

                }
            }else{
                if(oddstart==null){
                    oddstart=curr;
                    oddend=curr;
                }else{
                    oddend.next=curr;
                    oddend=oddend.next;

                }
            }
        }
        if(oddstart==null || evenstart==null){
            return head;
        }
        evenend.next=oddstart;
        oddend.next=null;
        return evenstart;


    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
 
        // head.next.next.next.next.next.next=new Node(45);
        head=EvenNoddnode(head);
        SLLimplimentation s =new SLLimplimentation(0);
        s.traversal(head);
    }
    
    
}
