import java.util.*;
public class Solution {
    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int low = 1;
        int high = stalls[n-1]-stalls[0];
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(canplace(stalls, mid, k) == true){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return high;
    }
    public static boolean canplace(int stalls[],int dis,int k){
        int cow = 1;
        int lastplaced = stalls[0];
        for(int i =1; i<stalls.length;i++ ){
            if(stalls[i]-lastplaced >=dis){
                cow++;
                lastplaced = stalls[i];
            }
        }
        if(cow>=k){
            return true;
        }
        return false;
    }
}
