// Sliding Window Problem
class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]==1){
                count++;
            }
        }
        int left = 0;
        int window_one = 0;
        int max_window_one = 0;
        for(int right = 0;right<2*n;right++){
            if(nums[right%n] == 1){
                window_one++;
            }
            if(right-left+1>count){
                window_one -= nums[left%n];
                left++;
            }
            max_window_one = Math.max(max_window_one,window_one);
        }
        return count - max_window_one;
    }
}
