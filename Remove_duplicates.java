public class Remove_duplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2, 5, 6, 8 };
        int[] result = removeDuplicates(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = arr[i];
            }
        }

        // Create the final array with non-duplicate elements
        int[] result = new int[j];
        System.arraycopy(temp, 0, result, 0, j);
        return result;
    }
}
