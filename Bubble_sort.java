public class Bubble_sort {
    public static void main(String[] args) {
        int []arr = {7,8,3,1,2,10,0,4,3,9};
        int n = arr.length;
        Bubblesort(arr , n);
        printsort(arr);
        
    }

    public static void Bubblesort(int []arr,int length){
        for(int i = 0;i < length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            Bubblesort(arr,length-1);

        }

    }
    public static void printsort(int []arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
