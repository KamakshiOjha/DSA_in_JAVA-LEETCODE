public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	int low = 0;
        int mid = 0;
        while(mid<arr.length){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }else{
                mid++;
            }

        }
    }
}
