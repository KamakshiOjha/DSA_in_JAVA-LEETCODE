import java.util.*;
public class Solution {  

    public static int pairSum(int arr[], int x) {
    	HashMap<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        int pairCount = 0;

        for (int value : arr) {
            int complement = x - value;

            if (map.containsKey(complement)) {
                pairCount += map.get(complement);

                // if (complement == value) {
                //     pairCount--;
                // }
            }
        }
        return pairCount / 2;
    }
}
