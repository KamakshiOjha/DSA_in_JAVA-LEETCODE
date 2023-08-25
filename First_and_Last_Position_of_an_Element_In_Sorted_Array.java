//coding ninja - First and Last Position of an Element In Sorted Array.

import java.util.ArrayList;

public class First_and_Last_Position_of_an_Element_In_Sorted_Array {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(10);
        arr.add(10);
        arr.add(11);
        arr.add(11);
        arr.add(11);
        int n = arr.size();
        int k = 10;
        System.out.println(firstAndLastPosition(arr, n, k));
    }
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int i = 0;
        int count = 0;
        int []a = new int[2];
        while(i<n){
            if(arr.get(i).equals(k) && count == 0){
                a[0]= i;
                // i++;
                // break; 
            }
            if(arr.get(i).equals(k) ){
                count++;
                a[1] = i; 
    
            }
            if(!arr.get(i).equals(k)&& count == 0){
                a[0] = -1;
                a[1] = -1;
            }
                i++;
        }return a;
    }
}
