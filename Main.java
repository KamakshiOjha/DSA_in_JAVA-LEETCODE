public class Main{
    public static void main(String[] args){
        LinkedList l = new LinkedList(4);
        l.append(7);
        l.append(9);
        l.append(11);

        // System.out.println("before removal of first element");
        // l.prepend(2);
        // System.out.println("after removal of first element");
        // l.removeFirst();

        // System.out.println("before");
        // l.printList();
        // System.out.println("after exchange");
        // l.setElement(2, 10);

        
        // System.out.println(l.remove());
        // System.out.println(l.remove());

        // System.out.println("before");
        // l.printList();
        // System.out.println("after insert");
        // l.insertElement(2,45);

        
        System.out.println("before");
        l.printList();
        System.out.println("after remove");
        l.removeElement(1);

    }
}
