//leetcode - Contains Duplicate II
//this is might be wrong for some testcase.

public class Contains_Duplicate_II {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                int absd = Math.abs(i-j);
                if(nums[i] == nums[j]&& absd <=k){
                    return true;
                }
            }
            
        }return false;
    }
}
