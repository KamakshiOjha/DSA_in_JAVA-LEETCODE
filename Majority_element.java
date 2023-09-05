//coding ninja - Majority element.
public class Majority_element {

    public static void main(String[] args) {
        int [] arr = {8,8,8,10,8,10};
        int n = arr.length;
        System.out.println(findMajority(arr, n));
    }

    public static int findMajority(int[] arr, int n) {
        int candidate = arr[0]; 
        int count = 1; 


        for (int i = 1; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = arr[i];
                    count = 1;
                }
            }
        }
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return candidate;
        }

        return -1; 
    }
}
