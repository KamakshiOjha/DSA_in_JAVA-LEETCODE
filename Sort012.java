//coding ninja
public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,1,0};
        sort012(arr);
    }
    public static void sort012(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i<n;i++){
            for(int j = 0;j<n;j++){
                if(arr[i]<arr[j] && i != j){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            
        }
    }
    for(int i = 0;i<n;i++){
        System.out.println(arr[i]);
    }
}
}
