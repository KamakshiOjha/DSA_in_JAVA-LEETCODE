// leetcode - 2006. Count Number of Pairs With Absolute Difference K
public class Absolute_Difference_K {
    public static void main(String[] args) {
        int []arr = {1,2,2,1};
        int k = 1;
        System.out.println(countKDifference(arr, k));
    }  
    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    count++;
                }
            }
        }
        return count;
    }
}
