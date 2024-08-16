class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        // for(List<Integer> num : arrays){
        //     for(int ele : num){
        //         if(ele != 0){
        //             min = Math.min(ele,min);
        //         }
        //         max = Math.max(ele,max);
        //     }
        // }
        // return Math.abs(max-min);
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int res = 0;
        
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> num = arrays.get(i);
            res = Math.max(res, Math.max(Math.abs(num.get(num.size() - 1) - min), Math.abs(max - num.get(0))));
            min = Math.min(min, num.get(0));
            max = Math.max(max, num.get(num.size() - 1));
        }
        
        return res;
    }
}
