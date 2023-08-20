public class Sum_min_max {
    public static void main(String[] args) {
        int[] arr = {-1,3,4,5,7,2,10};
        int n = arr.length;
        System.out.println("The sum of min and max sum is: "+sumOfMaxMin(arr, n));
    }  
    public static int sumOfMaxMin(int[] arr, int n) {
        int max = arr[0];
          int min = arr[0];
          
          for (int i = 0; i < arr.length; i++) {
              if (arr[i] > max) {
                  max = arr[i];
              }
              if (arr[i] < min) {
                  min = arr[i];
              }
          }
          
          int sum = min + max;
          return sum;
      } 
}
