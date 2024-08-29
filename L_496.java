class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] res = new int[n];
        
        for (int i = 0; i < n; i++) {
            int j = 0;
            
            while (j < m && nums2[j] != nums1[i]) {
                j++;
            }
            
            while (j < m && nums2[j] <= nums1[i]) {
                j++;
            }
            if (j < m) {
                res[i] = nums2[j];
            } else {
                res[i] = -1;
            }
        }
        
        return res;
    }
}
