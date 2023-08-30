//leetcode -  Median of Two Sorted Arrays.
import java.util.ArrayList;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,4};
        int[] nums2 = {3,5};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n = nums1.length;
        int m = nums2.length;
        while(i<n && j<m){
            if(nums1[i]>nums2[j]){
                arr.add(nums2[j]);
                j++;
            }
            else{
                arr.add(nums1[i]);
                i++;
            }
        }

        while(i<n){
            arr.add(nums1[i]);
            i++;
        }
        while(j<m){
            arr.add(nums2[j]);
            j++;
        }

        int k = arr.size();
        double num = 0;
        int e = k/2;
        if (k % 2 == 0) {
            num = (arr.get(e - 1) + arr.get(e)) / 2.0;
        } else {
            num = arr.get(e);
        }
        
        return num;
        
    }
}
