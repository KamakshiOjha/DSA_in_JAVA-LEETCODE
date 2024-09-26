class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        int n = nums.length;
        find(arr,nums,0,n);
        return arr;
    }
    public static void find(List<List<Integer>> arr,int[]nums,int ind,int n){
        if(ind==n){
            List<Integer> des = new ArrayList<>();
            for(int i = 0;i<n;i++){ 
                des.add(nums[i]);
            }
            arr.add(new ArrayList<>(des));
            return;
        }
        for(int i = ind;i<n;i++){
            swap(i,ind,nums);
            find(arr,nums,ind+1,n);
            swap(i,ind,nums);
        }

    }
    public static void swap(int i ,int j,int[]nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
