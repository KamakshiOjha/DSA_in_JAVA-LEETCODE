//leetcode - 1630. Arithmetic Subarrays

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arithmetic_Subarrays {
    public static void main(String[] args) {
        int[] nums = {4,6,5,9,3,7};
        int[] l = {0,0,2};
        int []r = {2,3,5};
        System.out.println(checkArithmeticSubarrays(nums, l, r));
    }
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();
        int n = nums.length;
        int m = l.length;
        for(int i = 0;i<m;i++){
            List<Integer> arr = new ArrayList<>();
            for(int j = l[i];j<=r[i];j++){
                arr.add(nums[j]);
            }
            if (arr.size() < 2) {
                result.add(false);
                continue;
            }
            Collections.sort(arr);
            int num = Math.abs(arr.get(0)-arr.get(1));
            boolean t = true;
            for(int k = 1;k<arr.size();k++){
                if(Math.abs(arr.get(k) - arr.get(k - 1))!=num){
                    t = false;
                    break;
                }
            }
            result.add(t);
        }
        return result;
    }
}
