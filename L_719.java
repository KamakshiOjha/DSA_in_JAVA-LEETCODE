class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        ArrayList<Integer> diff = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                diff.add(Math.abs(nums[i]-nums[j]));
            }
        }
        Collections.sort(diff);
        if(k>diff.size()){
            return 0;
        }
        return diff.get(k-1);
    }
}
