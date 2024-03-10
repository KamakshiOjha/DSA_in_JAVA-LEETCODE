// leetcode - 349. Intersection of Two Arrays
import java.util.ArrayList;

import java.util.HashSet;

public class L_349 {
    public static void main(String[] args) {
        int[]nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(intersection(nums1, nums2));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h = new HashSet<>();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i : nums1){
            h.add(i);
        }
        for(int i = 0;i<nums2.length;i++){
            if(h.contains(nums2[i])){
                a.add(nums2[i]);
                h.remove(nums2[i]);
            }
        }
        int[] arr = new int[a.size()];

        for(int i=0;i<arr.length;i++){
            arr[i] = a.get(i);
        }
        return arr;

    }
}
