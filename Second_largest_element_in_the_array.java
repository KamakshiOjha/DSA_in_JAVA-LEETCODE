//coding ninja - Second largest element in the array.
public class Second_largest_element_in_the_array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,8};
        int n = arr.length;
        System.out.println(findSecondLargest(n, arr));
    }
    public static int findSecondLargest(int n, int[] arr) {
		int max = Integer.MIN_VALUE; 
        int smax = Integer.MIN_VALUE; 

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                smax = max; 
                max = arr[i];
            } else if (arr[i] > smax && arr[i] < max) {
                smax = arr[i]; 
            }
        }
		
		if (smax == Integer.MIN_VALUE) {
            return -1; 
        }

        return smax;
	}
}
