class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count1 = 0;
        int count2 = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1){
                count1++;
            }
            else{
                count1=0;
            }
            count2 = Math.max(count1,count2);
        }
        return count2;
    }
}
