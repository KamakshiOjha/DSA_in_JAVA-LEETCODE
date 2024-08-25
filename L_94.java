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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        return helper(root,result);
    }
    public static List<Integer> helper(TreeNode root,List<Integer> result ){
        if(root == null){
            return result;
        }
        helper(root.left,result);//calls
        result.add(root.val);// in post we add it after calls and in pre before calls
        helper(root.right,result);//calls

        

        return result;

    }
}
