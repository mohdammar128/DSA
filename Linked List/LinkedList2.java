class LinkedList2 {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void print() {
        if (head == null) {
            System.out.println("Empty Linked List");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp);
    }

    // add First
    public void addFirst(int data) {
        size++;
        if (head == null) {
            head =tail= new Node(data);
            return ;
        }
        // create node
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }
    // remove first
    public void removeFirst(){
        if(head==null){
            return ;
        }
        if(head.next==null){
         head=tail=null;
         size--;
         return ;
        }
        head=head.next;
        head.prev=null;
        size--;

    }
    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;//yeah step addition hai baki sb logic singlr list jaisa hai
            prev =curr;
            curr=next;
        }
        head=prev;
    }

   public static void main(String[] args) {
    LinkedList2 dll =new LinkedList2();
    dll.addFirst(45);
    dll.addFirst(46);
    dll.addFirst(41);
    dll.addFirst(40);
  
    dll.print();
    dll.reverse();
    dll.print();
    System.out.println(LinkedList2.size);
   }
}