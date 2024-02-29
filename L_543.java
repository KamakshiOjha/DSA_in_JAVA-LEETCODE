//leetcode - 543. Diameter of Binary Tree
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
public class L_543{
    public static void main(String[] args) {
        TreeNode t = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        System.out.println(diameterOfBinaryTree(t));
    }
    public static int diameterOfBinaryTree(TreeNode root) {
        int []a = new int[1];
        count(root,a);
        return a[0];
    }
    public static int count(TreeNode root ,int []a){
        if(root == null){
            return 0;
        }
        int lh=count(root.left,a);
        int rh=count(root.right,a);
        a[0] = Math.max(a[0],lh+rh);
        return 1 + Math.max(lh,rh);
    }
}