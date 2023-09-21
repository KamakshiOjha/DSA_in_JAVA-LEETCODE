public class Hash_tables_main {
    public static void main(String[] args) {
        Hash_tables h = new Hash_tables();
        h.set("ice-cream", 2);
        h.set("banana", 5);
        h.set("life", 1);

        // h.printTable();
        
        System.out.println(h.get("banana"));
        System.out.println(h.get("banana1"));
        System.out.println(h.Keys());
    }
}
