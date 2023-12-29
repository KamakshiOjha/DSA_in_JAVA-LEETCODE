// leetcode - 1561.Maximum Number of Coins You Can Get
import java.util.Arrays;

public class Maximum_Number_of_Coins {
    public static void main(String[] args) {
        int[]piles = {9,8,7,6,5,1,2,3,4};
        System.out.println(maxCoins(piles));
    }
    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int count = 0;
        int n = piles.length/3;
        for(int i = 0;i<n;i++){
            count += piles[piles.length - 2 * (i + 1)];

        }
        return count;
    }
}
