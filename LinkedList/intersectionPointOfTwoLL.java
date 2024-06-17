
import java.util.HashSet;

public class intersectionPointOfTwoLL extends Node{

    public intersectionPointOfTwoLL() {
        super(0);
    }
    static int getPoint(Node head1, Node head2){
        Node curr1=head1;
        Node curr2=head2;
        while(curr1!=null && curr2!=null){
            if(curr1==curr2){
                return curr1.data;
            }
            curr1=curr1.next;
            if(curr1==null){
                curr2=curr2.next;
                curr1=head1;
            }
            
        }
        return -1;
    }
    static int getPointM1(Node head1, Node head2){
        Node curr1=head1;
        Node curr2=head2;
        HashSet<Node> set=new HashSet<>();
        while(curr1!=null){
            set.add( curr1);
            curr1=curr1.next;
        }
        while(curr2!=null){
            if(set.contains(curr2)){
                return curr2.data;
            }
            curr2=curr2.next;
            }
            return -1;
    }
    static int getPointM2(Node head1, Node head2){
        Node curr1=head1;
        Node curr2=head2;
        int count1=0;
        int count2=0;
        while(curr1!=null){
            count1++;
            curr1=curr1.next;
        }
        while(curr2!=null){
            count2++;
            curr2=curr2.next;
        }
        curr1=head1;
        curr2=head2;
        for(int i=1; i<=Math.abs(count1-count2);i++){
            curr1=curr1.next;
        }
        while(curr1!=null && curr2!=null){
            if(curr1==curr2){
                return curr2.data;
            }
            else{
                curr1=curr1.next;
                curr2=curr2.next;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        Node head1=new Node(11);
        head1.next=new Node(21);
        head1.next.next=head.next.next;
        // head1.next.next=new Node(3);
        System.out.println(getPoint(head, head1));
        System.out.println(getPointM1(head, head1));
        System.out.println(getPointM2(head, head1));
    }

    
}
