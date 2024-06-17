import java.util.ArrayDeque;
import java.util.Deque;

class Node{
    char data;
    Node next;

    Node(char data){
        this.data = data;
    }
}
public class PalindromeLL {
    static boolean isPalindrome(Node head){
        Deque<Character> stack = new ArrayDeque<>();
        for(Node curr=head; curr!=null; curr=curr.next){
            stack.push(curr.data);
        }
        for(Node curr=head; curr!=null; curr=curr.next){
            if(curr.data != stack.pop()){
                return false;
            }
        }
        return true;
    }
    static Node reverseRecursiveM1(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node rest_head=reverseRecursiveM1(head.next);
        Node rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return rest_head;
    }
    static boolean isPalindrome2(Node head){
       if(head==null)
            return true; 
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
         Node rev=reverseRecursiveM1(slow.next);
         Node curr=head;
         while(rev!=null){
            if(rev.data!=curr.data){
                return false;
            }
         }
         return true;
    }
    public static void main(String[] args) {
        Node head = new Node('a'); 
        head.next=new Node('d');
        head.next.next=new Node('f');
        head.next.next.next=new Node('d');
        // head.next.next.next.next=new Node('a');
        System.out.println(isPalindrome(head));
        System.out.println(isPalindrome2(head));
    }

    
}
