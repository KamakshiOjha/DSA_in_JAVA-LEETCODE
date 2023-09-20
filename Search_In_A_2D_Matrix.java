//coding ninja - Search In A 2D Matrix.
import java.util.ArrayList;

public class Search_In_A_2D_Matrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        for(int i = 0;i<3;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0;j<3;j++){
                row.add(i*3+j);
            }
            mat.add(row);
        }
        int target = 8;
        System.out.println(searchMatrix(mat, target));
    }
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        int n = mat.size();
        int m = (mat.get(0)).size();
        for(int i = 0;i<n;i++){
            for(int j =0;j<m;j++){
                if(mat.get(i).get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
}
