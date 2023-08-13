public class Hash_tables {
    private int size = 7;
    private Node[] dataMap;

    public Hash_tables(){
        dataMap = new Node[size];
    }

    public class Node{
        private String key;
        private int value;
        private Node next;

        public Node(String key, int value){
            this .key = key;
            this.value = value;
        }

    }

    public void printTable(){
        for(int i =0;i<dataMap.length;i++){
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while(temp != null){
                System.out.println("{" +temp.key + ":" + temp.value + "}");
                temp = temp.next;
            }
        }
    }
}
