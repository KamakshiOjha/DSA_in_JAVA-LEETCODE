//coding ninja - Find similarities between two arrays.
import java.util.ArrayList;

public class Find_similarities_between_two_arrays {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        int n = arr1.size();

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(4);
        arr2.add(6);
        arr2.add(8);
        int m = arr2.size();

        System.out.println(findSimilarity(arr1, arr2, n, m));

    }
    public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {
		ArrayList<Integer> combine = new ArrayList<>();
		int count=0;
		for(int i =0 ; i<n;i++){
			for(int j =0;j<m;j++){
				if(arr1.get(i).equals(arr2.get(j))){
					count++;
				}
			}
		}combine.add(count);
		n = n-count;
		m = m-count;
		int sum = n+m+count;
		combine.add(sum);
		return combine;
	}
}
