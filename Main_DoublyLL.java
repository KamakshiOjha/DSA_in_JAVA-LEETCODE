public class Main_DoublyLL {
    public static void main(String[] args) {
        DoublyLL l = new DoublyLL(7);
        l.append(4);
        l.append(5);
        // l.printLL();
        // System.out.println("element removed: " );
        // l.remove();
        // System.out.println("before prepend");
        // l.printLL();
        // System.out.println("after prepend");
        // l.prepend(5);
        // l.printLL();

        // System.out.println("before removefirst");
        // l.printLL();
        // System.out.println("after removefirst");
        // l.removeFirst();
        // l.printLL();

        // System.out.println(l.getElement(1));

        // System.out.println("before");
        // l.printLL();
        // System.out.println("after");
        // System.out.println(l.setElement(1, 25));
        // l.printLL();

        System.out.println("before");
        l.printLL();
        System.out.println("after");
        System.out.println(l.insertElement(1, 25));
        l.printLL();


    }
}
