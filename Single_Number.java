// leetcode - 136. Single Number
import java.util.HashMap;
import java.util.Map;

public class Single_Number {
    public static void main(String[] args) {
        int[]arr={1,2,6,7,8,8,6,5,3,2,4,3,0,4,0,88,77,34,5,63,1,88,77,34,5,63};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
}
