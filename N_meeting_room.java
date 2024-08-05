import java.util.*;

public class N_meeting_room {
    public static void main(String[] args) {
        int[]start = {0,3,1,5,5,8};
        int end[] = {5,4,2,9,7,9};
        meeting(start, end);
    }
    public static void meeting(int[]start,int[]end){
        int[][]matrix = new int[start.length][3];
        int n = start.length;
        for(int i = 0;i<n;i++){
            matrix[i][0] = start[i];
            matrix[i][1] = end[i];
            matrix[i][2] = i;
        }
        Arrays.sort(matrix, (a, b) -> Integer.compare(a[1],b[1]));
        ArrayList<Integer> arr = new ArrayList<>();
        int current = matrix[0][0];
        int finish = matrix[0][1];
        arr.add(matrix[0][2]);
        for(int i = 1;i<n;i++){
            if(finish<matrix[i][1] && current<matrix[i][0]){
                current = matrix[i][0]; 
                finish = matrix[i][1];
                arr.add(matrix[i][2]);
            }
        }
        for(int i : arr){
            System.out.println(i);
        }
        
        
    }
}
