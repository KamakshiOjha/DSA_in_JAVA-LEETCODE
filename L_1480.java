class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int []arr = new int[n];
        int sum = nums[0];
        arr[0] = nums[0];
        for(int i = 1;i<n;i++){
            sum = sum+nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}
