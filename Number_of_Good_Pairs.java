//leetcode - Number of Good Pairs.
public class Number_of_Good_Pairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(nums[i] == nums[j] && i<j){
                    count++; 
                }
            }
        }
        return count;
    }
}
