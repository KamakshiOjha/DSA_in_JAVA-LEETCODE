//coding_ninja
public class Count_inversion {
    public static void main(String[] args) {
        long arr[] = {3,2,1};
        int n = arr.length;
        System.out.println(getInversions(arr, n));
    }
    public static long getInversions(long arr[], int n) {
        long count = 0;
        for(int i=0;i<n;i++){
            for(int j = i+1; j<n;j++){
                if(arr[i]>arr[j] && i<j){
                    count++;
                }
            }
        }return count;
    }
}
