/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        return helper(root,result);
    }
    public static List<Integer> helper(TreeNode root,List<Integer>result){
        if(root == null){
            return result;
        }
        result.add(root.val);
        helper(root.left,result);
        helper(root.right,result);

        return result;
    }
}
