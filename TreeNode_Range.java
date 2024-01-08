//leetcode - 938. Range Sum of BST
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

public class TreeNode_Range {
    public static void main(String[] args) {
        TreeNode n = new TreeNode(10,
                        new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                        new TreeNode(15, null, new TreeNode(18)));

        TreeNode_Range treeRange = new TreeNode_Range();
        int result = treeRange.rangeSumBST(n, 7, 15);
        System.out.println("Result: " + result);
    }
        
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);

        } else if (root.val < low) {
            return rangeSumBST(root.right, low, high);

        }
        return (root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high));
    }
    
}
