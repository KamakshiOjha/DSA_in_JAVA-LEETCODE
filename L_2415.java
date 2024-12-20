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
    public TreeNode reverseOddLevels(TreeNode root) {
        // if (root == null) return null;
        // Queue<TreeNode> q = new LinkedList<>();
        // q.add(root);
        // boolean flag = false;
        // while(!q.isEmpty()){
        //     int level = q.size();
        //     List<TreeNode> node = new ArrayList<>();

        //     for(int i = 0;i<level;i++){
        //         TreeNode current = q.poll();
        //         node.add(current);
        //         if(current.left != null){
        //             q.add(current.left);
        //         }if(current.right != null){
        //             q.add(current.right);
        //         }
        //     }
        //     if(flag){
        //         int left = 0;
        //         int right = node.size() - 1;
        //         while(left<right){
        //             int temp = node.get(left).val;
        //             node.get(left).val = node.get(right).val;
        //             node.get(right).val = temp;
        //             left++;
        //             right--;
        //         }
        //     }
        //     flag = !flag;
        // }
        // return root;
        dfs(root.left,root.right,0);
        return root;
    }
    public void dfs(TreeNode left, TreeNode right, int depth) {
        if(left == null && right == null){
            return;
        }
        if(depth % 2 == 0){
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }
        dfs(left.left , right.right,depth+1);
        dfs(left.right,right.left,depth+1);
    }
}
