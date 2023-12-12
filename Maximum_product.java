public class Maximum_product {
    public static void main(String[] args) {
        int nums[] = {3, 4, 5, 2};
        int output = maxProduct(nums);
        System.out.println(output);
    }

    public static int maxProduct(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                int num = (nums[i] - 1) * (nums[j] - 1);
                if (num > max && i != j) {
                    max = num;
                }
            }
        }
        return max;
    }
}
