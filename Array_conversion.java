// leetcode - 2610. Convert an Array Into a 2D Array With Conditions
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Array_conversion {
    public static void main(String[] args) {
        int []num = {1,3,4,1,2,3,1};
        List<List<Integer>> dynamicList = new ArrayList<>();
        dynamicList = findMatrix(num);
        for (List<Integer> innerList : dynamicList) {
            for (Integer value : innerList) {
                System.out.print(value + " ");
            }
            System.out.println(); 
        }
    }
    public static List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<List<Integer>> dynamicList = new ArrayList<>();

        for(int num : nums){
            int row = countMap.getOrDefault(num, 0);
            if(dynamicList.size() == row){
                dynamicList.add(new ArrayList<>());
            }
            dynamicList.get(row).add(num);
            countMap.put(num, row + 1);
        }

        return dynamicList;
    }
}
