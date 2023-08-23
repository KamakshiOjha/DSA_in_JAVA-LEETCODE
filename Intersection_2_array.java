//coding ninja - intersection of 2 arrays
import java.util.ArrayList;

public class Intersection_2_array {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(2);
        arr1.add(3);
        arr1.add(5);
        arr1.add(2);

        int n = arr1.size();

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(3);
        arr2.add(5);
        arr2.add(5);

        int m = arr2.size();

        System.out.println(findArrayIntersection(arr1, n, arr2, m));
    }
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		ArrayList<Integer> arr = new ArrayList<>();

		for(int num : arr1){
				if(arr2.contains(num)){
					arr.add(num);
					arr2.remove(Integer.valueOf(num));
				
				}
	
		}
		return arr;
	}
}
