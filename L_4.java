class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]res = new int[nums1.length+nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                res[k] = nums1[i];
                i++;
            }else{
                res[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            res[k] = nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            res[k] = nums2[j];
            j++;
            k++;
        }
        if(res.length%2 == 0){
            double avg = (res[res.length/2-1] + res[res.length/2 ])/2.0;
            return avg;
        }
        return res[res.length/2];

    }
}
