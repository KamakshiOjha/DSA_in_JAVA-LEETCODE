import java.util.Arrays;

public class Solution {

    public static int arrayRotateCheck(int[] arr){
        int n = arr.length;
        int min = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]<arr[min]){
                min = i;
            }
        }
        return min;

    }

}
