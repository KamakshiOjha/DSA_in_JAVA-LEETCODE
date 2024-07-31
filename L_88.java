class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int index = 0;
        // int s = nums1.length;
        // for(int i = s-1;i>=m;i--){
        //     if(nums1[i]==0 && index<n){
        //         nums1[i] = nums2[index];
        //         index++;
        //     }
        // }
        
        // Arrays.sort(nums1);

        // optimal sol:
        int s = nums1.length;
        int last = m+n-1;
        while(m>0 && n>0){
            if(nums1[m-1]>nums2[n-1]){
                nums1[last] = nums1[m-1];
                m--;
            }else{
                nums1[last] = nums2[n-1];
                n--;
            }last--;

        }while(n>0){
            nums1[last] = nums2[n-1];
            n--;
            last--;
        }

    }
}
