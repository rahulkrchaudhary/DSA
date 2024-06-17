// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }
public class CSLLimplimentation extends Node {
    
    CSLLimplimentation(int x) {
        super(x);
        //TODO Auto-generated constructor stub
    }
    static void printListM1(Node head){
        // method-1
        if(head==null){
            System.out.println("list is empty");
        }
        System.out.println(head.data+" ");
        for(Node r=head.next; r!=head; r=r.next){
            System.out.println(r.data+"");
        }
    }
    static void printListM2(Node head){
        // method-2
        if(head==null){
            System.out.println("list is empty");
        }
        Node curr=head;
        do{
            System.out.println(curr.data);
            curr=curr.next;
        }while(curr!=head);
    }
    static Node insertBegin(Node head, int data){
        // navie solution O(n)
        Node newnode= new Node(data);
        if(head==null){
            newnode.next=newnode;
        }
        else
       {    
            Node curr=head;
            while(curr.next!=head){
                curr=curr.next;
            }
            
            curr.next=newnode;
            newnode.next=head;
        }
        return newnode;
    }
    static Node insertBeginM2(Node head, int data){
        // efficient solution O(1)
        Node newnode= new Node(data);
        if(head==null){
            newnode.next=newnode;
            return newnode;
        }
        else
       {    
        // inserting new node after head
         newnode.next=head.next;
         head.next=newnode;

        //  swapping the data of new node and head node
         int t=head.data;
         head.data=newnode.data;
         newnode.data=t;

        //  returning the old head
         return head;
       }
    }
    static Node insertEnd(Node head, int x){
        // efficient solution
        Node newnode=new Node(x);
        if(head==null){
            newnode.next=newnode;
            return newnode;
        }else{
            // inserting new node after head
            newnode.next=head.next;
            head.next=newnode;

            // swapping new node and head
            int t=head.data;
            head.data=newnode.data;
            newnode.data=t;

            // returning new node as head
            return newnode;
        }
    }
    static Node insertEndNaiveSoln(Node head, int x){
        // navie solution O(n) 
        Node newnode=new Node(x);
        if(head==null){
            newnode.next=newnode;
            return newnode;
        }else{
            Node curr=head;
            while(curr.next!=head){
                curr=curr.next;
            }
            curr.next=newnode;
            newnode.next=head;
            return head;
        }
    }    
    static Node deleteHeadM1(Node head){
        // navie solution O(n)
        if(head==null){
            return null;
        }
        if(head.next==head){
            return null;
        }
        Node curr=head;
        while(curr.next!=head){
            curr=curr.next;
        }
        curr.next=head.next;
        return curr.next;
        
    }
    static Node deleteHeadM2(Node head){
        // efficient solution O(1)
        if(head==null){
            return null;
        }
        if(head.next==head){
            return null;
        }
        // copying the data of next node of head to head and deleting the next node of head;
        head.data=head.next.data; 
        head.next=head.next.next;
        return head;
    }
    static Node deleteKthNode(Node head, int k){
        if(head==null){
            return null;
        }
        if(k==1){
            // head.data=head.next.data;
            // head.next=head.next.next;
            // return head;
            return deleteHeadM2(head);
        }else{
            Node curr=head;
            for(int i=0; i<k-2; i++){
                curr=curr.next;
            }
            curr.next=curr.next.next;
            return head;
        }
    }
        public static void main(String[] args) {
        // creating singly circular linked list
        // Node head=new Node(10);
        
        // Node temp1=new Node(5);
        // Node temp2=new Node(20);
        // Node temp3=new Node(15);
        // head.next=temp1;
        // temp1.next=temp2;
        // temp2.next=temp3;
        // temp3.next=head;
        Node head=null;
        head=insertBegin(head, 45);
        head=insertBeginM2(head, 50);
        head=insertEnd(head, 78);
        head=insertEndNaiveSoln(head, 90);
        head=insertBegin(head, 35);
        head=insertBeginM2(head, 450);
        head=deleteHeadM1(head);
        head=deleteHeadM2(head);
        head=deleteKthNode(head, 1);
        
        // printListM1(head);
        printListM2(head);

    }
    
}
