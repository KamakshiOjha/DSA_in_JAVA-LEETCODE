//coding ninja - find duplicate in array
import java.util.ArrayList;

public class Find_duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(5);
        arr.add(2);
        arr.add(1);
        int n= arr.size();
        System.out.println("The duplicate element in list is: "+findDuplicate(arr, n));
    }

    public static int findDuplicate(ArrayList<Integer> arr, int n){
        int duplicate = 0;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr.get(i).equals(arr.get(j))){
                    duplicate = arr.get(i);
                    break;
                }
            }
        }return duplicate;
    }
}
