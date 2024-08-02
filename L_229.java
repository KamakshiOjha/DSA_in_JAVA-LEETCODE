class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        int n = nums.length/3;
        List<Integer> arr = new ArrayList<>(); 
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            if(entry.getValue()>n){
                arr.add(entry.getKey());
            }
        }
        return arr;
    }
}
