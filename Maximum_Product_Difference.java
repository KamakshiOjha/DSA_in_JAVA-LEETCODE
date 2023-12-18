// leetcode - 1913. Maximum Product Difference Between Two Pairs
import java.util.Arrays;

public class Maximum_Product_Difference {
    public static void main(String[] args) {
        int[] nums = {4,2,5,9,7,4,8};
        System.out.println(maxProductDifference(nums));
    }
    public static int maxProductDifference(int[] nums) {
        // int a = 0;
        // int b = 0;
        // int c = 0;
        // int d = 0;
        // int value = 0;
        int n = nums.length;
        // Arrays.sort(nums);
        //     a = nums[n-1];
        //     b = nums[n-2];
        //     c = nums[0];
        //     d = nums[1];
        // return (a * b) - (c * d);
        // or 
        Arrays.sort(nums);
        return((nums[n-1]*nums[n-2])-(nums[0]*nums[1]));
    }
}
