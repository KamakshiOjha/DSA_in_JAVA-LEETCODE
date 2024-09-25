import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList < String > findSum(int[][] arr, int n) {
        ArrayList<String> path = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();

        find(arr, path, 0, 0, n,result);
        return result;
    }
    public static void find(int[][]arr,ArrayList<String>str,int ind1,int ind2,int n,ArrayList<String> result){
        if(ind1>=n && ind2>=n){
            return;
        }
        if(arr[ind1][ind2] == 0){
            return;
        }
        if(ind1 ==n-1 && ind2 == n-1){
            result.add(String.join("", str));
            return;
        }
        
        if(ind1+1<n && arr[ind1+1][ind2] == 1){
            str.add("D");
            find(arr,str,ind1+1,ind2,n,result);
            str.remove(str.size()-1);
        }
        if(ind2+1<n&&arr[ind1][ind2+1] == 1){
            str.add("R");
            find(arr,str,ind1,ind2+1,n,result);
            str.remove(str.size()-1);
        }
    }
}
