public class Search_insert {
    public static void main(String[] args) {
        int []arr = {1,3,4,5};
        int target = 2;
        int a = search_insert(arr,target);
        System.out.println("element will be at:" + a);
    }
    public static int search_insert(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            } else if (target > arr[i] && (i == arr.length - 1 || target < arr[i + 1])) {
                return i + 1; 
            }
        }
        return 0; 
        
        }
    }

