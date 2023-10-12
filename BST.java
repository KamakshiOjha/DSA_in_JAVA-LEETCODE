// BST
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
            if(newNode.value == temp.value) {
                return false;
            }
            else if(newNode.value < temp.value){
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
            else{
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }
    public void printTree(){

    }

    public void contains(int value){
        Node newNode = new Node(value);
        if(root == null){
            System.out.println("null");
            return;
        }
        else if(root == newNode){
            System.out.println(root.value);
            return;
        }
        Node temp = root;
        while(temp != null){
            if(newNode.value < temp.value){
                temp = temp.left;
            }
            else if(newNode.value > temp.value){
                temp = temp.right;
            }
            else{
                System.out.println(temp.value);
                return;
            }
        }  System.out.println("node not found");
    }
    
    
}
