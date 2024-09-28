class Solution {
    public int singleNonDuplicate(int[] nums) {
        // HashMap<Integer,Integer> hash = new HashMap<>();
        // for(int i= 0 ;i<nums.length;i++){
        //     hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        // }
        // for(Map.Entry<Integer,Integer> entry : hash.entrySet()){
        //     if(entry.getValue() == 1){
        //         return entry.getKey();
        //     }
        // }
        // return 0;
        int start = 0;
        int end = nums.length-2;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == nums[mid^1]){
                start = mid+1;
            }else{ 
                end = mid-1;
            }
        }
        return nums[start];
    }
}
