class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j = i;j<n;j++){
                sum = sum+nums[j];
                max = Math.max(max,sum);
            }
        }
        // if(max == 0){
        //     return nums[0];
        // }
        return max;
    }
}
