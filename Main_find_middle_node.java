public class Main_find_middle_node {
        public static void main(String[] args){
            Find_middle_node l = new Find_middle_node(4);
            l.append(7);
            l.append(9);
            l.append(11);

            System.out.println("Middle Node:");
        System.out.println( l.findMiddleNode().value);
}
}