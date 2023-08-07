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

    public boolean insert(int value){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true){
            if(newNode.value == temp.value) return false;
            else if(newNode.value < temp.value){
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp.left = newNode;
            }
            else{
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp.right = newNode;
            }
        }
    }

    
    
}
