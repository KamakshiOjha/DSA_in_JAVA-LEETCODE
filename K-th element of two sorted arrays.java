class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        int[]res = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int s = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                res[s] = arr1[i];
                i++;
            }else{
                res[s] = arr2[j];
                j++;
            }
            s++;
        }
        while(i<arr1.length){
            res[s] = arr1[i];
            i++;
            s++;
        }
        while(j<arr2.length){
            res[s] = arr2[j];
            j++;
            s++;
        }
        long element = res[k-1];
        return element;
    }
}
