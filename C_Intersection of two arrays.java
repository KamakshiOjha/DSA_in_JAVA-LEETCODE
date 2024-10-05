import java.util.HashMap;

public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {
    	HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0;i<arr2.length;i++){
            hash.put(arr2[i],hash.getOrDefault(arr2[i], 0)+1);
        }
        for(int val : arr1){
            if(hash.containsKey(val) && hash.get(val)>0){
                System.out.print(val + " ");
                hash.put(val, hash.get(val)-1);
            }
        }
    }
}
