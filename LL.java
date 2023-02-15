public class LL{

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        // create a new node 
        Node newnode = new Node(val);
        // if list is already empty then point head to newnode
        if(head == null){
            // both head and tail point to newnode
            head = newnode;
            tail = newnode;
            size++;
            return;
        }
        // else insert a node at first
        newnode.next = head;
        head = newnode;
        size++;
    }

    public void insertLast(int val){
        // if tail is null call insertFirst()
        if(tail == null){
            insertFirst(val);
            return;
        }
        // create new node
        Node newnode = new Node(val);
        // else insert node at last
        tail.next = newnode;
        tail = newnode;
        size++;
    }

    public void insert(int val, int index){
        // if index is 0 then call insertFirst()
        if(index == 0){
            insertFirst(val);
            return;
        }
        // if index is size-1 then call insertLast()
        if(index == (size-1)){
            insertLast(val);
            return;
        }
        // else create newnode and loop till index-1 and link newnode
        Node prev = get(index);
        Node newnode = new Node(val);
        newnode.next = prev.next;
        prev.next = newnode;
        size++;
    }


    public int deleteFirst(){
        // if list is empty return -1
        if(head == null){
            return -1;
        }
        // else delete first node
        int v = head.data;
        head = head.next;
        size--;
        return v;
    }

    public int deleteLast(){
        // if list is empty return -1
        if(tail == null)
            return -1;
        // else iterate till last-1 node and cut connection to last node
        int v = tail.data;
        Node prev = get(size-1);
        prev.next = null;
        tail = prev;
        size--;
        return v;
    }

    public int delete(int index){
        // if index is 0 call deleteFirst()
        if(index == 0)
            return deleteFirst();
        // if index is (size-1) call deleteLast()
        if(index == size-1)
            return deleteLast();

        // else iterate till given index and cut connection appropriately
        Node prev = get(index);
        int v = prev.next.data;
        prev.next = prev.next.next;
        size--;
        return v;
    }

    public Node get(int index){
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("END\n");
    }

    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

}