// leetcode - 1637. Widest Vertical Area Between Two Points Containing No Points
import java.util.Arrays;

public class Widest_Vertical_Area {
    public static void main(String[] args) {
        int[][]points = {{8,7},{9,9},{7,4},{9,7}};
        System.out.println(maxWidthOfVerticalArea(points));
    }
    public static int maxWidthOfVerticalArea(int[][] points) {
        // Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        // int result = 0;
        // for(int i = 0;i<points.length-1;i++){
        //     result = Math.max(result,points[i+1][0]-points[i][0]);
        // }
        // return result;

        int result = 0;
        int []temp = new int[points.length];
        for(int i = 0;i<points.length;i++){
            temp[i] = points[i][0];
        }
        Arrays.sort(temp);
        for(int i = 0;i<points.length-1;i++){
            result = Math.max(result,temp[i+1]-temp[i]);
        }
        return result;
    }
}
