class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        int s = nums1.length;
        for(int i = 0;i<s;i++){
            if(nums1[i]==0 && index<n){
                nums1[i] = nums2[index];
                index++;
            }
        }
        
        Arrays.sort(nums1);

    }
}
