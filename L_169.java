class Solution {
    public int majorityElement(int[] nums) {
        // int candidate = nums[0]; 
        // int count = 1; 
        // int n = nums.length;


        // for (int i = 1; i < n; i++) {
        //     if (nums[i] == candidate) {
        //         count++;
        //     } else {
        //         count--;
        //         if (count == 0) {
        //             candidate = nums[i];
        //             count = 1;
        //         }
        //     }
        // }

        // count = 0;
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] == candidate) {
        //         count++;
        //     }
        // }

        // if (count > n / 2) {
        //     return candidate;
        // }

        // return -1;
        int n = nums.length/2;
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            if(entry.getValue()>n){
                return entry.getKey();
            }
        }
        return -1; 
    }
}
