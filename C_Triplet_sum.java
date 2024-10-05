
public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
        int n = arr.length;
        int count = 0;
    	for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                for(int k = 0;k<n;k++){
                if(i<j && j<k && i<k && x == arr[i]+arr[j]+arr[k]){
                    count++;
                }
            }}
        }
        return count;
    }

}
