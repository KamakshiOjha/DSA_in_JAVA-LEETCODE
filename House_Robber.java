// leetcode - 198. House Robber
public class House_Robber {
    public static void main(String[] args) {
        int []nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int n = nums.length;
        int []t = new int[101];
        for(int i = 0;i<101;i++){
            t[i] = -1;
        }
        return solve(nums, 0,n, t);
    }
    public static int solve(int[]nums,int i,int n,int []t){
        if(i>=n){
            return 0;
        }
        if(t[i] !=-1){
            return t[i];
        }
        int steal = nums[i] + solve(nums, i+2, n, t);
        int skip = solve(nums, i+1, n, t);

        return t[i] = Math.max(steal, skip);
    }
}
