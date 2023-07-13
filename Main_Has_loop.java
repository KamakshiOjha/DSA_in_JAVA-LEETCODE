public class Main_Has_loop {
    public static void main(String[] args){
        Has_loop l = new Has_loop(4);
        l.append(7);
        l.append(9);
        l.append(11);

        System.out.println("Has Loop:");
        System.out.println( l.hasLoop());

        l.getHead().next.next.next = l.getHead().next;
 
        System.out.println( l.hasLoop());

}
}
