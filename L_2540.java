// leetcode - 2540. Minimum Common Value
public class L_2540 {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,6};
        int nums2[] = {2,3,4,5};
        System.out.println(getCommon(nums1, nums2));
    }
    public static int getCommon(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                return nums1[i];
            }
        }
        return -1;
    }
}
