class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums,0,nums.length-1);
        return nums;

    }
    public void conquer(int[]nums, int si,int mid,int end){
        int merge[] = new int[end-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=end){
            if(nums[i]<=nums[j]){
                merge[k] = nums[i];
                i++;
                k++;
            }else{
                merge[k] = nums[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            merge[k] = nums[i];
            i++;
            k++;

        }
        while(j<=end){
            merge[k] = nums[j];
            j++;
            k++;
            
        }
        for(int s = 0,t=si;s<merge.length;s++,t++){
            nums[t] = merge[s];
        }
    }
    public void divide(int[]nums, int si,int end){
        if(si>=end){
            return;
        }
        int mid = si + (end-si)/2;
        divide(nums,si,mid);
        divide(nums,mid+1,end);
        conquer(nums,si,mid,end);
    }
}
