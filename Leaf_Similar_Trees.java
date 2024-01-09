// leetcode - 872. Leaf-Similar Trees
import java.util.ArrayList;

class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
         this.right = right;
      }
}
public class Leaf_Similar_Trees {
    public static void main(String[] args) {
        // TreeNode root1 = new TreeNode(3,
        //     new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))),
        //     new TreeNode(1, new TreeNode(9), new TreeNode(8)));

        // TreeNode root2 = new TreeNode(3,
        //     new TreeNode(5, new TreeNode(6), new TreeNode(7)),
        //     new TreeNode(1, null, new TreeNode(4, new TreeNode(9), new TreeNode(8))));
        TreeNode root1 = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));

        TreeNode root2 = new TreeNode(1,
                new TreeNode(3),
                new TreeNode(2));

        System.out.println(leafSimilar(root1, root2));
    }
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        getLeaf(root1, arr1);
        getLeaf(root2, arr2);

        return arr1.equals(arr2);
    }
    public static void getLeaf(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            arr.add(root.val); 
        }
        getLeaf(root.left, arr); 
        getLeaf(root.right, arr); 
    }
}
