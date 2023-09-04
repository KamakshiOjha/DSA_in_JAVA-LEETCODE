// coding ninja - Find First and Last Position of Element in Sorted.
public class Find_First_and_Last_Position_of_Element_in_Sorted {
    public static void main(String[] args) {
        int []arr = {1,2,4,4,5};
        int x = 4;
        int[]array = searchRange(arr, x);
        for(int i = 0; i < array.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] searchRange(int []arr, int x) {
        int n = arr.length;
        int count = 0;
        int[] arr1 = new int[2];
        int temp = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x && count == 0) {
                arr1[0] = i;
            }
            if (arr[i] == x) {
                count++;
                temp = i;
            }
        }

        

        arr1[1] = temp;
        if (count == 0) {
            arr1[0] = -1;
            arr1[1] = -1;
        }
        return arr1;
    }
}
