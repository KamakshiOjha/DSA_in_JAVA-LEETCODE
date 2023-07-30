public class Selection_sort {
    public static void main(String[] args) {
        int []arr = {7,8,3,1,2};
        int n = arr.length;
        Selectionsort(arr , n);
        printsort(arr);

    }
    public static void Selectionsort(int []arr,int length){
        for(int i = 0;i < length-1;i++){
            int smallest = i;
            for(int j = i+1 ; j<length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

        }
    }
    public static void printsort(int []arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
