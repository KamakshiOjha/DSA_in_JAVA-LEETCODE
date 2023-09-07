import java.util.ArrayList;

public class Single_Element_in_a_Sorted_Array {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(6);
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        int result = 0;

        for (Integer num : arr) {
            result ^= num; 
        }

        return result;
    }
}
