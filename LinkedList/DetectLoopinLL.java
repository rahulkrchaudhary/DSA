
import java.util.HashSet;




class Node{
    boolean visited;
    int data;
    Node next;
    public Node(int x) {
        data=x;
        next=null;
        visited = false;
    }

}
public class DetectLoopinLL {
     
    static boolean hasLoopM1(Node head){
        Node curr=head;
        boolean ans=false;
        while (curr!=null) {
            if(curr.visited==false){
                curr.visited=true;
            }else{
                ans=true;
                break;
            }
            curr=curr.next;
        }
        return ans;
    }
    static boolean hasLoopM2(Node head){
        Node curr=head.next;
        Node temp=head;
        while(curr!=null){
            if(curr.next==null){
                return false;
            }
            if(curr.next==temp){
                return true;
            }
            Node next_curr=curr.next;
            curr.next=temp;
            curr=next_curr;
            
        }
        return false;
    }
    // using hashtable
    static boolean isLoop(Node head) {
        HashSet<Node>s=new HashSet<>();
        for(Node r=head; r!=null; r=r.next){
            if(s.contains(r)){
                return  true;
            }
            s.add(r);
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
        // head.next.next.next.next.next.next=head.next;
        head.next.next.next.next.next.next=new Node(45);
        System.out.println(hasLoopM1(head));
        System.out.println(hasLoopM2(head));
        System.out.println(isLoop(head));
         
    }

    
}
