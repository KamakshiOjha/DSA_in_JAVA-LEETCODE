public class Main{
    public static void main(String[] args){
        LinkedList l = new LinkedList(4);
        l.append(7);
        System.out.println("before removal of first element");
        l.prepend(2);
        System.out.println("after removal of first element");
        l.removeFirst();

        
        // System.out.println(l.remove());
        // System.out.println(l.remove());

        


    }
}
