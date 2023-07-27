public class Main_DoublyLL {
    public static void main(String[] args) {
        DoublyLL l = new DoublyLL(7);
        l.append(4);
        l.append(5);
        l.append(6);
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

        // System.out.println("before");
        // l.printLL();
        // System.out.println("after");
        // System.out.println(l.insertElement(1, 25));
        // l.printLL();

        // System.out.println("before");
        // l.printLL();
        // System.out.println("after");
        // System.out.println(l.removeElement(1));
        // l.printLL();

        Reverse_DLL l1 = new Reverse_DLL(7);
        l1.append(4);
        l1.append(5);
        l1.append(6);

         System.out.println("before");
        l1.printLL();
        System.out.println("after");
        l1.reverse();
        l1.printLL();


    }
}
