// leetcode - 2149. Rearrange Array Elements by Sign
public class Alternate_elements {
    public static void main(String[] args) {
        int nums[] = {1,2,-3,-1,-2,1,1,-1};
        alternate_positive_negative(nums);

    }
    public static void alternate_positive_negative(int []nums){
        int n = nums.length;
        int[] arr = new int[n];
        int posIndex = 0;
        int negIndex = 1;
        for(int i = 0;i<n;i++){
            if(nums[i]>0 && n>=posIndex){
                arr[posIndex] = nums[i];
                posIndex +=2;
            }else if(nums[i]<0 &&n>=negIndex){
                arr[negIndex] = nums[i];
                negIndex +=2;
            }
        }
        for(int i = 0;i<nums.length;i++){
            System.out.println(arr[i]);
        }
    }
}
