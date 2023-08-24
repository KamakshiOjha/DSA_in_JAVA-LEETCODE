//coding ninja - reverse array at from a particular position.

import java.util.ArrayList;

public class Reverse_array {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        int m = 3;
        reverseArray(arr,m);

    }
    public static void reverseArray(ArrayList<Integer> arr, int m){
        int i = m+1;
        int j = arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        for(int k = 0 ; k<arr.size();k++){
            System.out.println(arr.get(k));
        }
    }
}
