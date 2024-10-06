public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {
            int zeroIndex = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[zeroIndex];
                    arr[zeroIndex] = temp;

                    zeroIndex++;
                }
            }

            }
        
    }

}
