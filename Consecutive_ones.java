// Count Maximum Consecutive One’s in the array and Leetcode - 485. Max Consecutive Ones
public class Consecutive_ones {
    public static void main(String[] args) {
        int [] nums = {1, 1, 0, 1, 1, 1};
        int count1 = 0;
        int count2 = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1){
                count1++;
            }
            else{
                count1=0;
            }
            count2 = Math.max(count1,count2);
        }
        System.out.println(count2);
    
    }
}
