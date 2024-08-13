import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    List<List<Integer>> arr = new ArrayList<>();
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(0, new ArrayList<>(), 0, target, candidates);
        return arr;
    }
    
    public void dfs(int i, List<Integer> cur, int total, int target, int[] candidates) {
        if (total == target) {
            arr.add(new ArrayList<>(cur)); 
            return;
        }
        if (total > target || i == candidates.length) {
            return;
        }
        
        cur.add(candidates[i]);
        dfs(i + 1, cur, total + candidates[i], target, candidates);
        cur.remove(cur.size() - 1);
        
        while (i + 1 < candidates.length && candidates[i] == candidates[i + 1]) {
            i++;
        }
        
        dfs(i + 1, cur, total, target, candidates);
    }
}
