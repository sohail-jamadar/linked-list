class Main{
    
    public static void main(String args[]){
        LL l = new LL();
        l.insertFirst(1);
        l.insertFirst(2);
        l.insertFirst(3);
        l.insertLast(4);
        l.insertLast(5);
        l.insert(7, 2);
        l.print();
        System.out.println(l.deleteFirst());
        l.print();
        System.out.println(l.deleteLast());
        l.print();
        System.out.println(l.delete(1));
        l.print();
    }
}
