class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0;i<n;i++){
            int sum = nums[i];
            arr.add(sum);
            for(int j = i+1;j<n;j++){
                sum+=nums[j];
                arr.add(sum);
            }
        }
        Collections.sort(arr);
        int count = 0;
        for(int i = left-1;i<right;i++){
            count+=arr.get(i);
        }
        return count;
    }
}
