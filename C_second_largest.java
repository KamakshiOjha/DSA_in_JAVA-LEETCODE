import java.util.*;
public class Solution {  

    public static int secondLargestElement(int[] arr, int n) {
    	// Arrays.sort(arr);
        // return arr[arr.length-2];
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }else if(arr[i]>second && arr[i]!=first){
                second = arr[i];
            }
        }
        return second;
    }

}
