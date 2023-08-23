//coding ninja - to find out first missing positive smallest element in error when the array contains negative and positive values.
public class First_missing {
    public static void main(String[] args) {
        int[] arr = {-1,1,4,5};
        int n = arr.length;
        System.out.println(firstMissing(arr, n));
    }
    public static int firstMissing(int[] arr, int n) {
        int num = 1;
        boolean found = false;
        
        while (num <= n) {
            found = false;
            
            for (int i = 0; i < n; i++) {
                if (arr[i] == num) {
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                return num;
            }
            
            num++;
        }
        
        return num;
    }
}
