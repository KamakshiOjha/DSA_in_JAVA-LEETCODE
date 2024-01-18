// leetcode - 229. Majority Element II
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Majority_Element {
    public static void main(String[] args) {
        int []nums = {1,2};
        List<Integer> arr = new ArrayList<>(majorityElement(nums)); 
        for(int i = 0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

    }
    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        int n = nums.length/3;
        List<Integer> arr = new ArrayList<>(); 
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            if(entry.getValue()>n){
                arr.add(entry.getKey());
            }
        }
        return arr;
    }
}
