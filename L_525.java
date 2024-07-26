class Solution {
    public int findMaxLength(int[] nums) {
        int zero = 0;
        int one = 0;
        int result = 0;
        HashMap<Integer, Integer> diffmap = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i]==0){
                zero+=1;
            }
            else{
              one+=1;  
            }
            if(!diffmap.containsKey(one-zero)){
                diffmap.put(one-zero, i);
            }
            if(one == zero){
                result = one+zero;
            }else{
                int index = diffmap.get(one-zero);
                result = Math.max(result,i-index); 
            }
        }
        return result;
    }
}
