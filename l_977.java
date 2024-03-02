// 977. Squares of a Sorted Array
import java.util.Arrays;

public class l_977 {
    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
        System.out.println(sortedSquares(nums));
    }
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
