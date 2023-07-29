public class Binary_search {
    public static void main(String[] args){
        int[] array ={10,20,30,40,75,90};
        int target = 75;
        int start = 0;
        int end = (array.length)-1;
        int ans = binary_search(array,target,start,end);
        System.out.println(ans);

    }
    static int binary_search(int[] arr,int target,int start,int end){
        if(start > end){ 
            return -1;
        }
        int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                return binary_search(arr,target,start,mid-1);
            }
            else if(arr[mid]<target){
                return binary_search(arr,target,mid+1,end);
            }
            
       
        return -1;
    }
}
