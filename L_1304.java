class Solution {
    public int[] sumZero(int n) {
        int []arr = new int[n];
        if(n%2 ==0){
            for(int i = 1;i<n;i = i+2){
                arr[i-1] = i;
                arr[i] = -i;
            }
        }else{
            for(int i = 1;i<n-1;i = i+2){
                arr[i-1] = i;
                arr[i] = -i;
            }arr[n-1] = 0; 
        }
        return arr;
    }
}
