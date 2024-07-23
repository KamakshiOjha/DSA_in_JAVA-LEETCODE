class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(hash.containsKey(nums[i])){
                hash.put(nums[i],hash.get(nums[i])+1);
            }
            else{
                hash.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : hash.entrySet()){
            arr.add(entry.getKey());
        }
        Collections.sort(arr, (a,b) ->{
            if(hash.get(a) == hash.get(b)){
                return b-a;
            }else{
                return hash.get(a)-hash.get(b);
            }
        });
        int[] result = new int[n];
        int k =0;
        for(Integer num : arr) {
            for(int i = 0;i<hash.get(num);i++){
                result[k] = num;
                k++;
            }
        }
       return result;
    }
}
