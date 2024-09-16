class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates); 
        find(res,candidates,target, new ArrayList<>(),0);
        return res;
    }
    public static void find(List<List<Integer>> res,int[] candidates, int target, List<Integer> ds,int ind ){
        if(target == 0){
            res.add(new ArrayList<>(ds));
            return;
        }
        if(ind == candidates.length || target<0){
            return;
        }
        for(int i = ind;i<candidates.length;i++){
            if(i>ind && candidates[i-1] == candidates[i]){
                continue;
            }
            ds.add(candidates[i]);
            find(res,candidates, target-candidates[i],ds,i+1);
            ds.remove(ds.size()-1);
        }
        
    }
}
