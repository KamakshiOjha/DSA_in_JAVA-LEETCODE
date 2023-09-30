//leetcode - 132 Pattern - not efficient for large testcases.
public class Pattern_132 {
    public static void main(String[] args) {
        int arr[] = {3,1,4,2};
        System.out.println(find132pattern(arr));

    }
    public static boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return false;
        }
        
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] < nums[k] && nums[k] < nums[j]) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}
