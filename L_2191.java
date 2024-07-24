class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
         int n = nums.length;
        int map_n = 0;
        List<int[]> numPairs = new ArrayList<>();
        for(int i =0;i<n;i++){
            String numStr = Integer.toString(nums[i]);
            map_n = 0;
            for(char c : numStr.toCharArray()){
                map_n *= 10;
                int a = Integer.parseInt(String.valueOf(c));
                map_n += mapping[a];
                
            }
            numPairs.add(new int[]{map_n, i});
        }
        Collections.sort(numPairs, (a, b) -> Integer.compare(a[0], b[0]));

        int k = 0;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = nums[numPairs.get(i)[1]];
        }
        return result;

    }
}
