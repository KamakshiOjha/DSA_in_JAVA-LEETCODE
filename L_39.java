class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        int n= candidates.length; 
        List<List<Integer>> res = new ArrayList<>();
        find(0,res, candidates,target,new ArrayList<>(),n);
        return res;
    }
    public static void find(int ind,List<List<Integer>> res,int[] candidates, int target,List<Integer> ds,int n){
        if(target == 0){
            res.add(new ArrayList<>(ds));
            return;
        }
        if (ind == n || target < 0) {
            return;
        }
        ds.add(candidates[ind]);
        find(ind,res,candidates,target-candidates[ind],ds,n);
        ds.remove(ds.size()-1);
        find(ind+1,res,candidates,target,ds,n);

    }
}
