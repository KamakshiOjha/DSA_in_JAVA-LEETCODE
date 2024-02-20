//leetcode - 268. Missing Number
public class Missing_number {
    public static void main(String[] args) {
        int nums[] = {1,2,3,5,7,6,8,9,10,4};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // if(nums.length == 1 || nums[0]!=0){
        //     return Math.abs(nums[0]-1);
        // }
        // int n = nums.length;
        // int num = nums[0];
        // for(int i = 0;i<n;i++){
        //     if(nums[i]!=num){
        //         return num;
        //     }else{
        //         num++;
        //     }
        // }
        // return nums[n-1]+1;

        //optimised :
        int n = nums.length;
        int total = (n*(n+1))/2;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum +=nums[i];
        }
        return total-sum;

    }
}
