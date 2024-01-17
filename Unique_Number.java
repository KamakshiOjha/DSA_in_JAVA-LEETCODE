// leetcode - 1207. Unique Number of Occurrences
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Unique_Number {
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,3,4,5,3,3,2,3,4,5,4,3};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            count.put(arr[i],count.getOrDefault(arr[i], 0)+1);
        }
        Set<Integer> unique = new HashSet<>();
        for(int val : count.values()){
            if(!unique.add(val)){
                return false;
            }
        }
        return true;
    }
}
