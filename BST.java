public class BST {
    private Node root;

    public BST(){
        root = null;
    }

    class Node {
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
        }
    }
    
}
