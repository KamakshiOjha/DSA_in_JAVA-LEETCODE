//leetcode - Two Sum II - Input Array Is Sorted

public class Array_is_sorted {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,10,12,17};
        int target = 29;
        System.out.println(twoSum(numbers,target));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int n = numbers.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(numbers[i]+numbers[j] == target && i<j){
                    arr[0] = i+1;
                    arr[1] = j+1;
                }
            }
        }return arr;
    }
}
