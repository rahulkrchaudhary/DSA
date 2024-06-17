class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class MergeTwoSortedLL {
    static Node mergeList(Node head1, Node head2){
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        Node a=head1;
        Node b=head2;
        Node head=null;
        Node tail=null;
        // making head and tail outside the while loop
        // if(a.data<=b.data){
        //     head=tail=a;
        //     a=a.next;
        // }else{
        //     head=tail=b;
        //     b=b.next;
        // }
        while(a!=null && b!=null){
            if(a.data<=b.data){
                 if(head==null){
                    head=tail=a;
                }
                else{
                    tail.next=a;
                    tail=a;
                }
                a=a.next;
            }else{
                if(head==null){
                    head=tail=b;
                }
                else{
                    tail.next=b;
                    tail=b;
                }
                b=b.next;
            }
        }
        if(a==null){
            tail.next=b;
        }
        if(b==null){
            tail.next=a;
        }
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
        head.next=new Node(23);
        head.next.next=new Node(33);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(500);
        // head.next.next.next.next.next=new Node(600);
        Node head1=new Node(11);
        head1.next=new Node(22);
        head1.next.next=new Node(53);
        head1.next.next.next=new Node(490);
        head1.next.next.next.next=new Node(501);
        head1.next.next.next.next.next=new Node(656);
        Node head2=mergeList(head,head1);
        traversal(head2);

    }
}
    

