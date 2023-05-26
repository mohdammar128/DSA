
public class LinkedList1 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // jb koi bhi node nhi hai
        size++;
        if (head == null) {
            head = tail = new Node(data);
            return;
        }
        // step 1
        Node newNode = new Node(data);
        // step 2
        newNode.next = head;// link
        // step 3
        head = newNode;
    }

    public void addLast(int data) {
        // jb koi bhi node nhi hai
        size++;
        if (head == null) {
            head = tail = new Node(data);
            return;
        }
        // step 1
        Node newNode = new Node(data);
        // step 2
        tail.next = newNode;
        // step 3
        tail = newNode;
    }

    public void printList() {
        // jb koi bhi node nhi hai
        if (head == null) {
            System.out.println("list is Empty");
            return;
        }
        // step 1
        Node temp = head;
        // step 2
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println(" null");

    }

    public void add(int idx, int data) {
        if (idx == 0 || head == null) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp;
        temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        // System.out.println(newNode.data);

    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;

        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println();
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;

        }

        Node prev = head;
        while (prev.next != tail) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;

        return val;

    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }

            temp = temp.next;
            i++;

        }
        return -1;
    }

    public void reverseList() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthFromlast(int pos) {
        if (pos == 1) {
            removeLast();
            return;
        } else if (pos == size) {
            removeFirst();
            return;
        }
        int idx = size - pos;// find position of that element from first
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        Node prev = temp;
        temp = temp.next;
        prev.next = temp.next;
    }

    public Node findMid(Node head) {
        Node slow = head;// +1
        Node fast = head;// +2
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;

    }

    public boolean checkPalindrome() {
        if (head == null || head == tail) {
            return true;
        }
        // first step find mid
        Node midNode = findMid(head);
        // second step revese sencond half
        Node prev = null;
        Node curr = midNode;// yaha per dhayan dena doo
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        // step 3 check for palindrome
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;

    }

    /*----------------------------------list 2------------------------------------------------ */
    // cycle dection in linked list
    public boolean isCycle() { // floyd's cycle finding algorithm
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;// cycle is there
            }
        }
        return false;// cycle is not there

    }

    /* Rempve Cycle from LL */
    /*
     * detect the cycle
     * then slow ->+1 and fast ->+1
     * travese the LL until slow==fast
     */
    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (!cycle) {// cycle nhi hai
            return;
        }
        // meeting point
        slow = head;
        Node prev = null;// last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;// yaha per dhayan doo yaha per ab fast 1 step move ker raha hai
        }

        prev.next = null;
    }

    /* Merge sort on linked list */
    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;

            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);

        Node rightMid = mid.next;
        mid.next = null;
        Node newleft = mergeSort(head);
        Node newright = mergeSort(rightMid);
        //
        return merge(newleft, newright);

    }

    /* Zig-Zag fashion printing */
    public void ZigZag(Node head){
        if(head==null){
            return ;
        }
        //Step 1 find mid
        Node mid=getMid(head);
        //Step 2 reverse Second half
        
       Node prev=null;
       Node curr=mid.next;
       mid.next=null;
       Node next;
       while(curr!=null){
       next=curr.next;
       curr.next=prev;
       prev=curr;
       curr=next;
    
       }
       //merging
       Node leftHead,rightHead;
       rightHead=prev;
       leftHead=head;
       Node nextL,nextR;
       while(leftHead!=null && rightHead!=null){
        //zig-zag step
       nextL=leftHead.next;
       leftHead.next=rightHead;
       nextR=rightHead.next;
       rightHead.next=nextL;
       //update;
       rightHead=nextR;
       leftHead=nextL;
       }

    }

    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(2);
        // head = new Node(1);
        // head.next = new Node(2);
        // Node temp = head.next;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // 1->2->3->1
        // System.out.println(ll.size);
        // ll.removeLast();
        // ll.reverseList();
        // boolean res = ll.checkPalindrome();

        // ll.printList();
       
        // System.out.println(ll.isCycle());
        // ll.removeCycle();
        // System.out.println(ll.isCycle());
    
      
   ll.addLast(1);
   ll.addLast(2);
   ll.addLast(3);
   ll.addLast(4);
   ll.addLast(5);
      
        ll.printList();
        
        ll.ZigZag(head);
        ll.printList();

        // LinkedList1.head= ll.mergeSort(LinkedList1.head);
        // ll.printList();

    }

}
