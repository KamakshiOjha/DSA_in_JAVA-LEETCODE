public class Solution {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = arr[min];
            arr[min] =arr[i];
            arr[i] = temp; 
            }
        }
    }
}
