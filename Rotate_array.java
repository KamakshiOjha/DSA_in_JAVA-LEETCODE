//leetcode - Rotate array for given value of k fro k times.
public class Rotate_array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        rotate_array(nums,k);
        }
    public static void rotate_array(int[] nums, int k) {
        int n = nums.length;
        while(k>0){
            int num = nums[n-1];
            for (int i = n- 2; i >=0; i--) {
                nums[i + 1] = nums[i];
            }
            nums[0] = num;
            k--;
        }
        for(int i = 0;i<n;i++){
            System.out.println(nums[i]);
        }
    }
}
