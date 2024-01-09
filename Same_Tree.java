// leetcode - 100. Same Tree
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

public class Same_Tree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));

        TreeNode q = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));

        System.out.println(isSameTree(p,q));
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null){
            return p==q;
        }
        return (p.val==q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }
}
