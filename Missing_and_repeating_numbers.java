//coding ninja - Missing and repeating numbers.
import java.util.ArrayList;

public class Missing_and_repeating_numbers {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(6);
        arr.add(4);
        arr.add(3);
        arr.add(5);
        arr.add(5);
        arr.add(1);
        int n = arr.size();
        System.out.println(missingAndRepeating(arr, n));

    }
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] result = new int[2];
        int i = 0;
        while (i < n) {
            if (arr.get(i) != arr.get(arr.get(i) - 1)) {
                int temp = arr.get(i);
                arr.set(i, arr.get(temp - 1));
                arr.set(temp - 1, temp);
            } else {
                i++;
            }
        }
        for (i = 0; i < n; i++) {
            if (arr.get(i) != i + 1) {
                result[0] =  i + 1;
                result[1] = arr.get(i); 
                break;
            }
        }

        return result;
    }
}
