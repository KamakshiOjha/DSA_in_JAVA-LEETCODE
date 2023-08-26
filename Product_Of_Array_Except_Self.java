public class Product_Of_Array_Except_Self {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] array = getProductArrayExceptSelf(arr);
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static int[] getProductArrayExceptSelf(int[] arr) {
        int n = arr.length;
    	int [] a = new int[n];
        for(int i = 0;i<n;i++){
            int product = 1;
            for(int j = 0; j<n;j++){
                if(i!=j){
                    product = arr[j]*product;
                }
            }a[i]=product;
        }return a;
    }
}
