//coding ninja - Remove Duplicates from Sorted Array
import java.util.ArrayList;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(4);
        int n = arr.size();
        System.out.println(removeDuplicates(arr,n));
    }
    public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		int i =0;
		while(i<n){
			int j = i+1;
			while(j<n){
				if(arr.get(i).equals(arr.get(j))){
					arr.remove(j);

					n--;
				}else{
					j++;
				}
			}i++;
		}
		return n;
	}
}
