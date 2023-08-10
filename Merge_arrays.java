public class Merge_arrays {
    public static void main(String[] args) {
        int []arr1 = {1, 4, 6, 7};
        int m = 4;
        int []arr2 = {2, 3, 5, 8};
        int n = 4;
        merge(arr1, arr2, m, n);
        
        
    }

    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        int []merged = new int[m + n];
        int i = 0;
        int j = 0;
        int temp = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                merged[temp] = arr1[i];
                i++;
            } else {
                merged[temp] = arr2[j];
                j++;
            }
            temp++;
        }
        while (i < m) {
            merged[temp] = arr1[i];
            i++;
            temp++;
        }
        while (j < n) {
            merged[temp] = arr2[j];
            j++;
            temp++;
        }
        for (int k = 0; k < m + n; k++) {
            System.out.println(merged[k]);
        }
    }
}
