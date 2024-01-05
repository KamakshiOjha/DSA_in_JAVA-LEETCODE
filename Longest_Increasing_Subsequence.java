//leetcode - 300. Longest Increasing Subsequence
import java.util.Arrays;
public class Longest_Increasing_Subsequence {
    public static void main(String[] args) {
        int [] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums) {
        if(nums == null && nums.length == 0){
            return 0;
        }
        int n = nums.length;
        int []arr = new int[n];
        Arrays.fill(arr,1);
        int maxlen = 1;
        for(int i = 1;i<n;i++){
            for(int j = 0;j<i;j++){
                if(nums[i]>nums[j]){
                    arr[i] = Math.max(arr[i],arr[j]+1);
                }
            }maxlen = Math.max(maxlen,arr[i]);
        }

        
        return maxlen;
    }
}
