
public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	int i = arr1.length-1;
        int j = arr2.length-1;
        int carry = 0;
        int k = output.length-1;
        while(i>=0&& j>=0){
            int sum = arr1[i] + arr2[j] + carry;
            int ans = sum%10;
            output[k] = ans;
            carry = (sum - ans)/10;
            i--;
            j--;
            k--;
        }
        while(i>=0){
            output[k] = arr1[i];
            i--;
            k--;
        }
        while(j>=0){
            output[k] = arr2[j];
            j--;
            k--;
        }
        output[k] = carry;
    }

}
