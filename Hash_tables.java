import java.util.ArrayList;

public class Hash_tables {
    private int size = 7;
    private Node[] dataMap;

    public Hash_tables(){
        dataMap = new Node[size]; // array
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

    private int hash(String key){
        int hash =0;
        char[] keychars= key.toCharArray();//array - tochararry - putting in array
        for(int i =0;i<keychars.length;i++){
            int asciivalue = keychars[i];
            hash = (hash+asciivalue *23)% dataMap.length;//23 is prime no so number we get is random , datmap length is 7
        } 
        return hash;
    }
    
    public void set(String key,int value){
        int index = hash(key);
        Node newNode = new Node(key, value);
        if(dataMap[index] == null){
            dataMap[index] =newNode;
        }else{
            Node temp = dataMap[index];
            while(temp != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key){
        int index = hash(key);
        Node temp = dataMap[index];
        while(temp != null){
            if(temp.key == key){
                return temp.value;
            }temp = temp.next;
        }return 0;
    }

    public ArrayList Keys(){
        ArrayList<String> allkeys = new ArrayList<>();
        for(int i = 0;i<dataMap.length;i++){
            Node temp = dataMap[i];
            while(temp != null){
                allkeys.add(temp.key);
                temp = temp.next;
            }

        }
        return allkeys;
    }
}
