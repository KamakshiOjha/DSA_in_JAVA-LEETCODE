class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        find(0,res,nums,new ArrayList<>());
        return res;
    }
    public static void find(int ind,List<List<Integer>> res,int[]nums,List<Integer> ds ){
        res.add(new ArrayList<>(ds));
        for(int i = ind;i<nums.length;i++){
            if(ind!=i &&nums[i]==nums[i-1]){
                continue;
            }
            ds.add(nums[i]);
            find(i+1,res,nums,ds);
            ds.remove(ds.size()-1);
        }
    }
    
}
