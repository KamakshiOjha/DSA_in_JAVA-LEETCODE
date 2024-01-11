// leetcode - 1026. Maximum Difference Between Node and Ancestor
import java.util.*;
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
public class Difference_Between_Node_and_Ancestor {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10,
                        new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                        new TreeNode(15, null, new TreeNode(18)));

        System.out.println(maxAncestorDiff(root));
    }
    public static int maxAncestorDiff(TreeNode root) {
        return getleaf(root , Integer.MAX_VALUE ,Integer.MIN_VALUE );
    }
    private static int getleaf(TreeNode root , int min , int max){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        min = Math.min(min,root.val);
        max = Math.max(max,root.val);
        int left = getleaf(root.left, min, max);
        int right = getleaf(root.right, min, max);
        return Math.max(max-min,Math.max(left,right));
    }
}
