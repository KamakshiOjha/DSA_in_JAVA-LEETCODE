// 128. Longest Consecutive Sequence
import java.util.Arrays;

public class Consecutive_Sequence {
    public static void main(String[] args) {
        int []nums = {100,101,102,103,1,2,4,5,6};
        System.out.println(Sequence_Array(nums));
    }
    public static int longestConsecutive(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int count = 1;
        Arrays.sort(nums);
        int var = nums[0];
        int n = nums.length;
        int count_out = 1;
        for(int i =1;i<n;i++){
            if(Math.abs(var-nums[i])==1){
                count++;
            }else if(var == nums[i]){
                continue;
            }
            else if(Math.abs(var-nums[i])!=1){
                count = 1;
            }
            count_out = Math.max(count_out,count);
            var = nums[i];
        }
        return count_out;
    }
}
