public class Insertion_sort {
    public static void main(String[] args) {
        int[] array = {10,20,30,-11,15,26};
        insertion_sort(array);
        printsort(array);
    }
    public static void insertion_sort(int [] arr){
        for(int i=1; i<arr.length;i++){
            int current =arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
    public static void printsort(int []arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
