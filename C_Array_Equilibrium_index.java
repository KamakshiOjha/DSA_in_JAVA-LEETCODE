public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		// int mid = arr.length/2;
		// int n = arr.length;
		// if(n==0){
		// 	return -1;
		// }
		// int left = 0;
		// int right = 0;
		// for (int i = 0; i < mid; i++) {
        //     left += arr[i];
        // }
        // for (int i = mid + 1; i < n; i++) {
        //     right += arr[i];
        // }
		// while(left!=right){
		// 	if(left>right){
		// 		mid--;
        //         if (mid < 0) { 
        //             return -1;
        //         }
        //         right += arr[mid + 1];
        //         left -= arr[mid]; 
		// 	}else{
		// 		mid++;
        //         if (mid >= n) { 
        //             return -1;
        //         }
        //         left += arr[mid - 1];  
        //         right -= arr[mid];
		// 	}
		// }
		// if(left==right){
		// 	return mid;
		// }
		// return -1;
		int totalSum = 0;
        int leftSum = 0;
        int rightSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        for(int i = 0;i<arr.length;i++){
            rightSum = totalSum - leftSum - arr[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum +=arr[i];
        }
        return -1;

	}
}
