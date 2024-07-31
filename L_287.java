class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        }
        int keys = 0;
        for(Map.Entry<Integer,Integer> entry : hash.entrySet()){
            int value = entry.getValue();
            if(value>1){
                keys = entry.getKey();
            }
        }
        return keys;
    }
}
