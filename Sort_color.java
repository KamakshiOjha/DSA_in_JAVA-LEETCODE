// Leetcode - sort color
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.

public class Sort_color {
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        sortColors(nums);
    }
    public static void sortColors(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(nums[i]>nums[j] ){
                    int pre= nums[i];
                    nums[i] =nums[j];
                    nums[j] = pre;
                }
            }
        }
        for(int i = 0;i<n;i++){
            System.out.println(nums[i]);
        }

    }
}
