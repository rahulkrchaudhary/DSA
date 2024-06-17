// class Node{
//     int data;
//     Node next;
//     public Node prev;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }
public class SLLimplimentation extends Node {
    SLLimplimentation(int x) {
        super(x);
        //TODO Auto-generated constructor stub
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
    public static void traversalByRecursive(Node head){
        if(head==null){
            return;
        }
        System.out.println(head.data+" ");
        traversalByRecursive(head.next);
    }
    public static Node insertFront(Node head, int data){
        Node newnode=new Node(data);
        if(head==null){
            newnode=head;
        }
        newnode.next=head;
        head=newnode;
        return head;
    }
    public static Node insertBegin(Node head, int x){
        Node newnode=new Node(x);
        newnode.next=head;
        return newnode;
    }
    public static Node insertEnd(Node head, int x){
        Node temp=new Node(x);
        if(head==null){
            return temp;
        }
        Node curr=head;
        while ( curr.next!=null) {
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    } 
    public static Node insertPos(Node head, int x, int pos){
        Node temp=new Node(x);
        if(pos==1){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        for(int i=1; i<=pos-2 && curr!=null; i++){
            curr=curr.next;
        }
        if(curr==null){
            return head;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    } 
    public static Node deleteFirstNode(Node head){
        if(head==null){
            return null;
        }else{
            return head.next;
        }
    }
    static Node deleteLastNode(Node head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }
    static int searchNodeIterative(Node head, int x){
        // int i=0;
        // Node curr=head;
        // while(curr.data!=x){
        //     i++;
        //     curr=curr.next;
        // }
        // if(curr==null){
        //     return -1;
        // }
        // return i+1;
        int pos=1;
        Node curr=head;
        while(curr!=null){
            if(curr.data==x){
                return pos;
            }else{
                pos++;
                curr=curr.next;
            }
        }
        return -1;
     
    }
    static int searchNodeRecursive(Node head, int x){
        if(head==null){
            return -1;
        }
        if(head.data==x){
            return 1;
        }else{
             
            int res=searchNodeRecursive(head.next, x);
            if(res==-1){
                return -1;
            }else{
                return res+1;
            }
        }
    }
    public static void main(String[] args) {
        // 1st method to create a linked list
        /*Node head=new Node(5);
        head.next=new Node(23);
        head.next.next=new Node(45);*/
        // 2nd method to create a linked list
        /*Node head=new Node(23);
        Node temp1=new Node(34);
        Node temp2= new Node(64);
        head.next=temp1;
        temp1.next=temp2;
        head=insertFront(head, 234);*/
        // inset At the begining 
        Node head=null;
        head=insertBegin(head, 30);
        head=insertBegin(head, 45);
        head=insertBegin(head, 89);

        // insert at end
        head=insertEnd(head, 340);
        head=insertEnd(head,1);
        head=insertEnd(head, 145);
        head=insertPos(head, 45, 4);
        head=deleteFirstNode(head);
        head=deleteLastNode(head);
        traversal(head);
        // System.out.println(searchNodeIterative(head, 340));
        // System.out.println(searchNodeRecursive(head, 340));
    

        

    }
    
}
