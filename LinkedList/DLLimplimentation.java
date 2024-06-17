class Node{
    int data;
    Node prev;
    Node next;
    Node(int x){
        data=x;
        next=null;
        prev=null;
    }
}
public class DLLimplimentation extends Node 
{
    Node prev;
    public DLLimplimentation(int x, Node prev) {
        super(x);
        this.prev=null;
        //TODO Auto-generated constructor stub
    }

    
    public static void traversal(Node head){
        if(head==null){
            System.out.println("DLL is empty");
        }
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    } 
    public static Node insertBegining(Node head, int data){
        Node newnode=new Node(data);
        // if(head==null){
        //     return newnode;
        // }
        // head.prev=newnode;
        // newnode.next=head;
        // return newnode;
        newnode.next=head;
        if(head!=null){
            head.prev=newnode;
        }
        return newnode;
    }
    public static Node insertEnd(Node head, int data){
        Node newnode=new Node(data);
        if(head==null){
            return newnode;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newnode;
        newnode.prev=curr;
        return head;
    }
    public static Node DeletefrontNode(Node head){
        // if(head==null || head.next==null){
        //     return null;
        // }
        // head.next.prev=null;
        // return head.next;
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        head=head.next;
        head.prev=null;
        return head;
    }
    public static Node deleteLastNode(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node curr=head;
        // while(curr.next.next!=null){
        //     curr=curr.next;
        // }
        // curr.next=null;
        // return head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.prev.next=null;
        return head;
    }
    public static Node reverseDLL(Node head){
        Node curr=head, prev=null;
        while(curr!=null){
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;

        }
        return prev.prev;
    }
    public static void main(String[] args) {
        // creating DLL with three node;
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        // Node head=null;
        head=insertBegining(head, 40);
        head=insertEnd(head, 50);
        head=DeletefrontNode(head);
        head=deleteLastNode(head);
        traversal(head);
        // head=reverseDLL(head);
        // traversal(head);
    }
    
}
