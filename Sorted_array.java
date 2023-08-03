public class Sorted_array {
    public static void main(String[] args) {
        int arr[] = {9,2,5,7,9,10};
        boolean a = Check_array_sorted(arr);
        System.out.println("is the array sorted : "+a);
    }
    public static boolean Check_array_sorted(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }return true;

    }
}
