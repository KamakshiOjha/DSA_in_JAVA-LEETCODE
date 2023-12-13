// Leetcode - Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.
public class Element_Appearing{
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(arr));
    }
    //not optimised solution
    public static int findSpecialInteger(int[] arr) {
        int record = 0;
        int element_position = 0;
        int virtual = 0;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(arr[i]==arr[j]&& i!=j){
                    virtual++;
                }
                if(record<=virtual){
                    record = virtual+1;
                    element_position = i;
                }

            }virtual = 0;
        }
        return arr[element_position];
    }
    //optimised
    // public int findSpecialInteger(int[] arr) {
    //     int n = arr.length;
    //     int target = n/4;
    //     for(int i = 0;i<(n-target);i++){
    //         if(arr[i]==arr[i+target]){
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }

}