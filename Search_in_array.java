//search common elements in 2 arrays using hash map.

import java.util.HashMap;

public class Search_in_array {
    public static void main(String[] args) {
        int []arr1 = {1,3,4,5};
        int []arr2 = {2,8,6};
        System.out.println(itemInCommon(arr1, arr2));
        // System.out.println(itemInCommon(arr1, arr2));
    }
    // public static boolean itemInCommon(int[] arr1,int[] arr2){
    //     for(int i : arr1){
    //         for(int j : arr2){
    //             if(i==j) return true;
    //         }
    //     }
    //     return false;
    // }
        public static boolean itemInCommon(int[] arr1,int[] arr2){
            HashMap<Integer,Boolean> h = new HashMap<>();
            for(int i:arr1){
                h.put(i,true);
            }
            for(int j:arr2){
                if(h.get(j) !=null) return true;
            }
            return false;
        }
}
