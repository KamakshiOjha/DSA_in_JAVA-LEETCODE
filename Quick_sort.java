public class Quick_sort {
    public static void main(String[] args) {
        int []arr = {4,5,1,7,8,99,88};
        quicksort(arr, 0, arr.length - 1);
        printsort(arr);
    }
    public static void quicksort(int []arr, int first,int last){
        if(first<last){
            int q = partition(arr, first,last);
            quicksort(arr,  first,q-1);
            quicksort(arr,  q+1,last);
        }
    }
    public static int partition(int[] arr, int first, int last) {
        int pivot = arr[last];
        int i = first - 1;

        for (int j = first; j <last ; j++) {
            if (arr[j] <= pivot) {
                i = i + 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[last];
        arr[last]=temp;
        return i+1;
    }
    public static void printsort(int []arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
