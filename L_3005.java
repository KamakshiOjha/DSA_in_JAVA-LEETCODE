// leetcode - 3005. Count Elements With Maximum Frequency
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class L_3005 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }
    public static int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i = 0;i<n;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> arr = new ArrayList<>(count.values());
        Collections.sort(arr);
        int element = arr.get(arr.size()-1);
        int sum = arr.get(arr.size()-1);
        for(int i = arr.size()-2;i>=0;i--){
            if(element == arr.get(i)){
                sum+= arr.get(i);
            }else{
                return sum;
            }
        }
        return sum;
    }
}
