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
            head = newnode;
            return;
        }
        // else insert a node at first
        newnode.next = head;
        head = newnode;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("END");
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