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
    public TreeNode createBinaryTree(int[][] descriptions) {
        int n = descriptions.length;
        int m = descriptions[0].length;
        HashMap<Integer,TreeNode> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();


        for(int i =0;i<n;i++){
            set.add(descriptions[i][1]);
            TreeNode parent = map.getOrDefault(descriptions[i][0],new TreeNode(descriptions[i][0]));
            if(descriptions[i][2]==1){
                parent.left = map.getOrDefault(descriptions[i][1],new TreeNode(descriptions[i][1]));
                map.put(descriptions[i][1], parent.left);
            }
            else{
                parent.right = map.getOrDefault(descriptions[i][1],new TreeNode(descriptions[i][1]));
                map.put(descriptions[i][1], parent.right);
            }
            map.put(descriptions[i][0],parent);
        }
            int root = 1;
            for(int i =0;i<n;i++){
                if(!set.contains(descriptions[i][0])){
                    root = descriptions[i][0];
                    break;
                }
            }
            return map.getOrDefault(root,null);
        
    }
}
